//Codigo de usuario
package compiladorfinal;
import java_cup.runtime.Symbol;
import java_cup.runtime.*;
import java.io.Reader;

%%
%class AnalizadorLexico
%cup
%full
%line
%char
%ignorecase

//Definiciones
digito = [0-9]
letra = [a-zA-Z]
id = ({letra}|{digito})*({letra}|{digito})*
espacio = \t|\f|" "|\r|\n

//Reglas Léxicas
%%
"+"                     {return new Symbol(sym.SUMA, yychar, yyline, yytext());}
"-"                     {return new Symbol(sym.RESTA, yychar, yyline, yytext());}
"*"                     {return new Symbol(sym.MULTIPLICACION, yychar, yyline, yytext());}
"/"                     {return new Symbol(sym.DIVISION, yychar, yyline, yytext());}
"**"                    {return new Symbol(sym.POTENCIA, yychar, yyline, yytext());}
"sqrt"                  {return new Symbol(sym.RAIZCUADRADA, yychar, yyline, yytext());}
";"		{return new Symbol(sym.PUNTOCOMA, yychar, yyline, yytext());}
{id}                    {return new Symbol(sym.ID, yychar, yyline, yytext());}
{espacio}               {}		
.                       { System.out.println("Caracter ilegal: " + yytext()); }
