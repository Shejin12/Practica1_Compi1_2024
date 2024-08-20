java -jar jflex-full-1.9.1.jar Proyecto1.jflex
move ".\Lexer.java" "..\src\main\java\com\mycompany\practica_1\Analizadores"

java -jar java-cup-11b.jar -parser Parser Proyecto1.cup
move "Parser.java" "..\src\main\java\com\mycompany\practica_1\Analizadores"
move "sym.java" "..\src\main\java\com\mycompany\practica_1\Analizadores"