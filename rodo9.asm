CR EQU 13          ; Retorno de carro
LF EQU 10          ; Salto de l?nea

Datos segment
    Mensaje db CR,LF, 'El resultado de la suma es: $'
    Num1 db '12', '$'         ; Primer n?mero (como cadena)
    Num2 db '34', '$'         ; Segundo n?mero (como cadena)
    Resultado db '000', '$'    ; Resultado de la suma en cadena
Datos ends

Pila Segment Stack
    db 64 DUP('PILA')         ; Inicializaci?n de la pila
Pila Ends

Codigo Segment
    assume CS:Codigo, DS:Datos, SS:Pila

    holam3 proc far
        mov ax, Datos          ; Cargar segmento de datos
        mov ds, ax
        
        ; Cargar los dos n?meros y convertirlos a binario
        mov al, Num1           ; Cargar primer n?mero en AL
        sub al, '0'            ; Convertir de ASCII a valor num?rico
        mov bl, Num2           ; Cargar segundo n?mero en BL
        sub bl, '0'            ; Convertir de ASCII a valor num?rico
        
        ; Sumar los dos n?meros
        add al, bl             ; Sumar AL y BL
        
        ; Convertir el resultado a ASCII
        add al, '0'            
        mov Resultado, al      ; Almacenar resultado en la variable
        
        ; Mostrar el mensaje
        lea dx, Mensaje        ; Cargar direcci?n del mensaje
        call Escribe           ; Llamar a procedimiento de escritura

        ; Mostrar el resultado
        lea dx, Resultado      ; Cargar direcci?n del resultado
        call Escribe           ; Llamar a procedimiento de escritura

        mov ax, 4C00h          ; Terminar el programa
        int 21h

    holam3 endp

    ; Procedimiento para escribir en pantalla
    Escribe proc
        mov ah, 9              ; Funci?n DOS para escribir texto
        int 21h                ; Llamar a la interrupci?n
        ret
    Escribe endp

Codigo ends
end holam3
