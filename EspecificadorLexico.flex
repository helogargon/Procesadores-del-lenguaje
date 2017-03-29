import java.io.*;
import java.util.*;

import java_cup.runtime.*;

%%

%cup
%line
%column
%class AnalizadorLexico

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

%xstate ENTRECOMILLADO, COMENTARIO

%%
"="	{return new java_cup.runtime.Symbol(sym.igual);}
"+"	{return new java_cup.runtime.Symbol(sym.op_mas);}
"*"	{return new java_cup.runtime.Symbol(sym.op_mul);}
"/"	{return new java_cup.runtime.Symbol(sym.op_div);}
"%"	{return new java_cup.runtime.Symbol(sym.op_mod);}
"("	{return new java_cup.runtime.Symbol(sym.p);}
<YYINITIAL>{
	{ident}	{return new java_cup.runtime.Symbol(sym.ident);}

	{constfloat} {System.out.print(yytext());}

	{constint} {System.out.print(yytext());}

	"'".*"'"	{yypushback(yylength()-1);yybegin(ENTRECOMILLADO);}

	"//".*	{System.out.println(yytext());}

	"/*".*	{System.out.print("/*");yybegin(COMENTARIO);yypushback(yylength()-2);}

	.+	{System.out.print("Error: "+yytext());}

	"\n"	{System.out.print("\n");}
}

<ENTRECOMILLADO> "\\\'"	{palabra += "'";}

<ENTRECOMILLADO> "'"	{System.out.print(palabra);	palabra = "";	yybegin(YYINITIAL);}

<ENTRECOMILLADO> .	{palabra += yytext();}

<COMENTARIO> .*"*/"	{System.out.println(yytext());yybegin(YYINITIAL);}

<COMENTARIO> .|"\n"	{System.out.print(yytext());}


