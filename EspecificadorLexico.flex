import java.io.*;
import java.util.*;

%%

%{
	private BufferedWriter bw;
	private String palabra = "";
%}
%init{
	try{
		bw = new BufferedWriter(new FileWriter("salida.html"));
	}catch(IOException ioe){
		System.err.println("File not exist");
	}
%init}

%eof{
	try{
		bw.close();
	}catch(IOException ioe){System.err.println("Error");}
%eof}

ident= [[:letter:]|[$]][[:letter:]|"_"|[0-9]|"$"]*
signo= [+-]?
decint= {signo}[1-9][0-9]+|{signo}[0-9]
decfloat= {signo}[0-9]+"."[0-9]+
octint = {signo}0([0-7])*
octfloat = {signo}0([0-7])*"."([0-7])+
hexint= "0x"{signo}[A-F0-9]+
hexfloat= "0x"{signo}[A-F0-9]+"."[A-F0-9]+
constint= {decint}|{octint}|{hexint}
constfloat= {decfloat}|{octfloat}|{hexfloat}

%standalone

%xstate ENTRECOMILLADO, COMENTARIO, COMENTARIO_L, TEXTO

%%

{ident}	{bw.write(yytext()); yybegin(TEXTO);}

{constfloat} {bw.write(yytext()); yybegin(TEXTO);}

{constint} {bw.write(yytext()); yybegin(TEXTO);}

"'"	{yybegin(ENTRECOMILLADO);}

"//"	{yybegin(COMENTARIO_L);}
"/*"	{yybegin(COMENTARIO);}

<ENTRECOMILLADO> "\'"	{palabra += "'";}

<ENTRECOMILLADO> "'"	{bw.write(palabra);	palabra = "";	yybegin(YYINITIAL);}

<ENTRECOMILLADO> .	{palabra += yytext();}

<COMENTARIO_L> .	{bw.write(yytext());	yybegin(YYINITIAL);}

<COMENTARIO> "*/"	{yybegin(YYINITIAL);}

<COMENTARIO> .	{bw.write(yytext());}

