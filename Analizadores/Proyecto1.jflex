// Codigo de usuario
package com.mycompany.practica_1.Analizadores;
import java_cup.runtime.*;

%%

%class Lexer
%standalone
%cup
%line
%column
%public
// Expresiones regulares =========================================================

//      OPERADORES LOGICOS
Suma =      "+"
Resta =     "-"
Multi =     "*"
Divisn =    "/"

OPERADOR =  ({Suma}|{Resta}|{Multi}|{Divisn})


//       COLORES DISPONIBLES
amarillo =  "amarillo"
azul =      "azul"
celeste =   "celeste"
morado =    "morado"
naranja =   "naranja"
rojo =      "rojo"
rosado =    "rosado"
turquesa =  "turquesa"
verde =     "verde"

COLOR =     ({amarillo}|{azul}|{celeste}|{morado}|{naranja}|{rojo}|{rosado}|{turquesa}|{verde})


//      FIGURAS
circulo =   "circulo"
cuadrado =  "cuadrado"
rectangulo = "rectangulo"
poligono =  "poligono"
linea =     "linea"

FIGURA = ({circulo}|{cuadrado}|{rectangulo}|{poligono}|{linea})


//      MOVIMIENTO DE LAS FIGURAS
Mov_linea = "linea"
Mov_curva = "curva"

MOVIMIENTO = ({Mov_linea}|{Mov_curva})


//      INSTRUCCIONES
graficar =  "graficar"
animar =    "animar"
objeto = "objeto"
anterior = "anterior"

INSTRUCCION = ({graficar}|{animar})


//      UTILIDADES
Digito = [0-9]
Numeros = {Digito}+
Flotantes = {Numeros}"."{Numeros}
Par_Opn =   "("
Par_Cls =   ")"
Coma = ","
nombre = [a-zA-Z0-9_][a-zA-Z0-9_]*
Operacion = {Numeros}{OPERADOR}{Numeros}
Espacio = \s*(\r\n|\r|\n)

%{

    
    private Symbol newSymbol(int tipo, Object contenido){
        return new Symbol(tipo, yyline+1, yycolumn +1, contenido);
    }

    private Symbol newSymbol(int tipo){
        return new Symbol(tipo, yyline+1, yycolumn+1);
    }


%}


%% 
// Reglas lexicas


    //Numeros
{Numeros}   {return newSymbol(sym.NUMEROS, Integer.parseInt(yytext())); }
{Flotantes} {return newSymbol(sym.FLOTANTES, Double.parseDouble(yytext()));}

    //Palabras reservadas
    {COLOR} {return newSymbol(sym.COLOR, yytext()); }


    //Operadores
    {Suma}   { return newSymbol(sym.SUMA); }
    {Resta}  { return newSymbol(sym.RESTA); }
    {Multi}  { return newSymbol(sym.MULTI); }
    {Divisn} { return newSymbol(sym.DIVISN); }

    {circulo}    { return newSymbol(sym.CIRCULO); }
    {cuadrado}   { return newSymbol(sym.CUADRADO); } 
    {rectangulo} { return newSymbol(sym.RECTANGULO); }  
    {poligono}   { return newSymbol(sym.POLIGONO); } 
    {linea}      { return newSymbol(sym.LINEA); }

    {Mov_curva} { return newSymbol(sym.CURVA); }

    {graficar} { return newSymbol(sym.GRAFICAR); }
    {animar}   { return newSymbol(sym.ANIMAR); }
    {objeto}    {return newSymbol(sym.OBJETO); }
    {anterior}  {return newSymbol(sym.ANTERIOR); }

    { Par_Opn } {return newSymbol(sym.PAROPN);}
    { Par_Cls } {return newSymbol(sym.PARCLS);}
    {Coma} {return newSymbol(sym.COMA); }

    {nombre} {return newSymbol(sym.ID);}
    {Espacio} {System.out.println("espacio"); }

