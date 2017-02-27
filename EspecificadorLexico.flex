import java.io.*;
import java.util.*;

%%

%{
	private BufferedWriter bw;
%}
%init{
	try{
		bw = new BufferedWriter(new FileWriter("salida.html"));
	}catch(IOException ioe){
		System.out.println("File not exist");
	}
%init}

%eof{
	try{
		bw.close();
	}catch(IOException ioe){System.out.println("Error");}
%eof}

ident= [[:letter:]|[$]][[:letter:]|"_"|[0-9]|"$"]*
signo= [+-]?
decint= {signo}[1-9][0-9]+
decfloat= {signo}[0-9]+"."[0-9]+
octint = {signo}0([0-7])*
octfloat = {signo}0([0-7])*"."([0-7])+
hexint= "0x"{signo}[A-F0-9]+
hexfloat= "0x"{signo}[A-F0-9]+"."[A-F0-9]+
constint= {decint}|{octint}|{hexint}
constfloat= {decfloat}|{octfloat}|{hexfloat}

%standalone

%xstate entrecomillado, comentario, texto

%%

{ident}	{bw.write(yytext()); yybegin(texto);}

{constfloat} {bw.write(yytext()); yybegin(texto);}

{constint} {bw.write(yytext()); yybegin(texto);}

"'"	{	bw.write("'");
		yybegin(texto);
}

<entrecomillado> "\'" {	bw.write("'");
			yybegin(texto);
			}

<texto> [^"\'""'"]|.|\n {yybegin(entrecomillado);
			bw.write(yytext());
			yybegin(YYINITIAL);
		}

