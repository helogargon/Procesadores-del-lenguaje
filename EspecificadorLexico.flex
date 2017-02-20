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
decint= {signo}[0-9]+
decfloat= {decint}"."[0-9]+
octint = {signo}0([0-7])*
octfloat = {signo}0([0-7])*"."([0-7])+
hexint= "0x"{signo}[A-F0-9]+
hexfloat= "0x"{signo}[A-F0-9]+"."[A-F0-9]+

%standalone

%%

{ident}	{bw.write(yytext());}

{decfloat} {bw.write(yytext());}

{decint} {bw.write(yytext());}

"\n"	{bw.write(yytext());}

