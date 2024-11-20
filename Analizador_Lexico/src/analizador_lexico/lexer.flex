package analizador_lexico
import static analizador_lexico.Token.*;
%%
%class Lexer
%type Token


L = [a-zA-Z_]
D = [0-9]
WHITE=[ \t\r\n]

%{
public String tipo;
%}

%%
{WHITE} {/*Ignora*/}
"//".* {/*Ignora*/}

"=" {return ASIGNAR;}
"+" {return SUMA;}
"-" {return RESTA;}
"*" {return MULTIPLICACION;}
"/" {return DIVIsION;}
"^" {return POTENCIA;}

{L} ({L}|{D})* {tipo=yytext();
return ID;}

("(-"{D}+")")|{D} + {tipo=yytext();
return INT;}

. {return ERROR;}