.model small ; se asigna tama?o de memoria 
.stack ; modelo de pila
.data; inicio de datos
mensaje db "Tecnologico de estudios superiores de jilotepec",'$'
mensaje2 db "Ingenieria en sistemas",'$'
mensaje3 db "                                 ","$"
.code;iicio de codigo 
main proc;inicia proceso principal
mov ax, SEG @data; se asigna la localizacion del segmento
mov ds,ax
mov ah,09h; se imprime la cadena 
lea dx, mensaje; leer mensaje cds
int 21h
mov ah,09h; se imprime la cadena 
lea dx, mensaje3
int 21h
mov ah,09h; se imprime la cadena 
lea dx, mensaje2
int 21h

mov ax, 4c00h;salir del programa
int 21h
main endp; termina procedimiento 
end main  