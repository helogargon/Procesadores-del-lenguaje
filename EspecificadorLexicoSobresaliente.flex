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
"["	{return new java_cup.runtime.Symbol(sym.corch_A);}
"]"	{return new java_cup.runtime.Symbol(sym.corch_C);}
"=="	{return new java_cup.runtime.Symbol(sym.igualIgual);}
"<"	{return new java_cup.runtime.Symbol(sym.menor);}
">"	{return new java_cup.runtime.Symbol(sym.mayor);}
"<="	{return new java_cup.runtime.Symbol(sym.menorIgual);}
">="	{return new java_cup.runtime.Symbol(sym.mayorIgual);}
"."	{return new java_cup.runtime.Symbol(sym.punto);}
","	{return new java_cup.runtime.Symbol(sym.coma);}
";"	{return new java_cup.runtime.Symbol(sym.pcoma);}
" "	{;}
"return"	{return new java_cup.runtime.Symbol(sym.return_);}
"void"	{return new java_cup.runtime.Symbol(sym.tvoid);}
"int"	{return new java_cup.runtime.Symbol(sym.tint);}
"float"	{return new java_cup.runtime.Symbol(sym.tfloat);}
"struct"	{return new java_cup.runtime.Symbol(sym.tstruct);}
"if"	{return new java_cup.runtime.Symbol(sym.tif);}
"then"	{return new java_cup.runtime.Symbol(sym.tthen);}
"else"	{return new java_cup.runtime.Symbol(sym.telse);}
"for"	{return new java_cup.runtime.Symbol(sym.tfor);}
"while"	{return new java_cup.runtime.Symbol(sym.twhile);}
"do"	{return new java_cup.runtime.Symbol(sym.tdo);}
"until"	{return new java_cup.runtime.Symbol(sym.tuntil);}
"not"	{return new java_cup.runtime.Symbol(sym.tnot);}
"or"	{return new java_cup.runtime.Symbol(sym.tor);}
"and"	{return new java_cup.runtime.Symbol(sym.tand);}

{ident}	{return new java_cup.runtime.Symbol(sym.ident, yytext());}

{constfloat} {return new java_cup.runtime.Symbol(sym.constfloat, yytext());}

{constint} {return new java_cup.runtime.Symbol(sym.constint, yytext());}

"'".*"'"	{yypushback(yylength()-1);yybegin(ENTRECOMILLADO);}

"//".*	{System.out.println(yytext());}

"/*".*	{System.out.print("/*");yybegin(COMENTARIO);yypushback(yylength()-2);}
\n {;}
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

