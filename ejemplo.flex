import java_cup.runtime.*;

%%

%class AnalizadorLexico
%unicode
%cup

%%
";"	{return new java_cup.runtime.Symbol(sym.pComa);}
"or"	{return new java_cup.runtime.Symbol(sym.or);}
"and"	{return new java_cup.runtime.Symbol(sym.and);}
"nand"	{return new java_cup.runtime.Symbol(sym.nand);}
"nor"	{return new java_cup.runtime.Symbol(sym.nor);}
"xor"	{return new java_cup.runtime.Symbol(sym.xor);}
"xnor"	{return new java_cup.runtime.Symbol(sym.xnor);}
"("	{return new java_cup.runtime.Symbol(sym.pA);}
")"	{return new java_cup.runtime.Symbol(sym.pC);}
"true"	{return new java_cup.runtime.Symbol(sym.trueT);}
"false"	{return new java_cup.runtime.Symbol(sym.falseF);}
"not"	{return new java_cup.runtime.Symbol(sym.not);}
"=="	{return new java_cup.runtime.Symbol(sym.igual);}
"!="	{return new java_cup.runtime.Symbol(sym.distinto);}
"<"	{return new java_cup.runtime.Symbol(sym.menor);}
">"	{return new java_cup.runtime.Symbol(sym.mayor);}
"=<"	{return new java_cup.runtime.Symbol(sym.menorIgual);}
"=>"	{return new java_cup.runtime.Symbol(sym.mayorIgual);}
[0-9]+	{return new java_cup.runtime.Symbol(sym.numero, yytext());}

/*errorfallback*/
[^]|\n	{;}
