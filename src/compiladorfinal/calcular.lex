//CODIGO DE USUARIO
package compiladorfinal;
//Paquetes de cup necesarios
import java_cup.runtime.Symbol;
import java_cup.runtime.*;
import java.io.Reader;

%%
//Nombre de la clase
%class AnalizadorLexico
//Activa la compatibilidad con el generador de analizadores sintácticos CUP
%cup
//Activa la compatibilidad con todos los caracteres ASCII
%full
//Activa la funcionalidad para contar la linea donde se produce un error sintáctico
%line
//Activa el contador de caracteres
%char


//DFINICIONES
//Conjunto de caracteres numericos que acepta el compilador
digito = [0-9]
//Conjunto de caracteres mayúsculas y minúsculas el compilador
letra = [a-zA-Z]
//ID que resulta de la combinacion de letras y numeros
id = ({letra}|{digito})*({letra}|{digito})*
//Conjunto de secuencias de escape
espacio = \t|\f|" "|\r|\n

//REGLAS LEXICAS
%%
//Recibe el signo mas y devuelve el token SUMA
"+"                     {return new Symbol(sym.SUMA, yychar, yyline, yytext());}
//Recibe el signo menos y devuelve el token MENOS
"-"                     {return new Symbol(sym.RESTA, yychar, yyline, yytext());}
//Recibe el signo asterisco  y devuelve el token MULTIPLICACION
"*"                     {return new Symbol(sym.MULTIPLICACION, yychar, yyline, yytext());}
//Recibe el signo slash y devuelve el token DIVISION
"/"                     {return new Symbol(sym.DIVISION, yychar, yyline, yytext());}
//Recibe doble slash y devuelve el token POTENCIA
"**"                    {return new Symbol(sym.POTENCIA, yychar, yyline, yytext());}
//Recibe la cadena sqrt y devuelve el RAIZCUADRADA
"sqrt"                  {return new Symbol(sym.RAIZCUADRADA, yychar, yyline, yytext());}
//Recibe el signo punto y coma, y devuelve el token PUNTOCOMA
";"                     {return new Symbol(sym.PUNTOCOMA, yychar, yyline, yytext());}
//Recibe el id  y devuelve el token ID
{id}                    {return new Symbol(sym.ID, yychar, yyline, yytext());}

{espacio}               {}		
//Presenta el mensaje de caracter ilegal cuando se ingrese un carater no aceptado.
.                       { System.out.println("Caracter ilegal: " + yytext()); }
