import java.io.*;
import java.util.*;

import java_cup.runtime.*;

%%

%class AnalizadorLexico
%unicode
%cup
%line
%column
%eofval{
  return new Symbol(sym.EOF);
%eofval}


%{
	private String palabra = "";
%}
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

%xstate ENTRECOMILLADO, COMENTARIO

%%
<YYINITIAL>{
"="	{return new java_cup.runtime.Symbol(sym.igual);}
"-"	{return new java_cup.runtime.Symbol(sym.op_sub);}
"+"	{return new java_cup.runtime.Symbol(sym.op_sum);}
"*"	{return new java_cup.runtime.Symbol(sym.op_mul);}
"/"	{return new java_cup.runtime.Symbol(sym.op_div);}
"%"	{return new java_cup.runtime.Symbol(sym.op_mod);}
"("	{return new java_cup.runtime.Symbol(sym.par_A);}
")"	{return new java_cup.runtime.Symbol(sym.par_C);}
"{"	{return new java_cup.runtime.Symbol(sym.llave_A);}
"}"	{return new java_cup.runtime.Symbol(sym.llave_C);}
","	{return new java_cup.runtime.Symbol(sym.coma);}
";"	{return new java_cup.runtime.Symbol(sym.pcoma);}
" "	{;}
"return"	{return new java_cup.runtime.Symbol(sym.return_);}
"void"	{return new java_cup.runtime.Symbol(sym.tvoid);}
"int"	{return new java_cup.runtime.Symbol(sym.tint);}
"float"	{return new java_cup.runtime.Symbol(sym.tfloat);}

{ident}	{return new java_cup.runtime.Symbol(sym.ident);}

{constfloat} {return new java_cup.runtime.Symbol(sym.constfloat);}

{constint} {return new java_cup.runtime.Symbol(sym.constint);}

"'".*"'"	{yypushback(yylength()-1);yybegin(ENTRECOMILLADO);}

"//".*	{System.out.println(yytext());}

"/*".*	{System.out.print("/*");yybegin(COMENTARIO);yypushback(yylength()-2);}
\n {System.out.print(yytext());}
[^] {;}	
}

<ENTRECOMILLADO> "\\\'"	{palabra += "'";}

<ENTRECOMILLADO> "'"	{String s = palabra;
						palabra = "";
						yybegin(YYINITIAL);
						return new java_cup.runtime.Symbol(sym.constlit, s);}

<ENTRECOMILLADO> .	{palabra += yytext();}

<COMENTARIO> .*"*/"	{System.out.println(yytext());yybegin(YYINITIAL);}

<COMENTARIO> .|"\n"	{System.out.print(yytext());}

