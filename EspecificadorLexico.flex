import java.io.*;
import java.util.*;

%%

%{
	private String palabra = "";
%}
%init{

%init}

%eof{
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

%xstate ENTRECOMILLADO, COMENTARIO, COMENTARIO_L,TEXTO

%%
<YYINITIAL>{
	{ident}	{System.out.print(yytext());}

	{constfloat} {System.out.print(yytext());}

	{constint} {System.out.print(yytext());}

	"'"	{yybegin(ENTRECOMILLADO);}

	"//"	{System.out.print("//");yybegin(COMENTARIO_L);}

	"/*"	{System.out.print("/*");yybegin(COMENTARIO);}

	[.]+	{System.out.print("Error: "+yytext()); yybegin(TEXTO);}

	"\n"	{System.out.print("\n"); yybegin(YYINITIAL);}
}

<ENTRECOMILLADO> "\\\'"	{palabra += "'";}

<ENTRECOMILLADO> "'"	{System.out.print(palabra);	palabra = "";	yybegin(YYINITIAL);}

<ENTRECOMILLADO> .	{palabra += yytext();}

<COMENTARIO_L> .	{System.out.print(yytext());	yybegin(YYINITIAL);}

<COMENTARIO> "*/"	{System.out.print("*/");yybegin(YYINITIAL);}

<COMENTARIO> .|"\n"	{System.out.print(yytext());}

<TEXTO>	"\n"	{System.out.print("\n"); yybegin(YYINITIAL);}


