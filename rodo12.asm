.model small
.stack 100h
.data
    name1 db 'Juan', 0
    age1 db 23
    name2 db 'Pepe', 0
    age2 db 15
    msg1 db ' es m?s grande que ', 0
    newline db 13, 10, '$'

.code
main:
    ; Inicializa el segmento de datos
    mov ax, @data
    mov ds, ax

    ; Compara las edades
    mov al, age1
    cmp al, age2
    ja juan_is_greater   ; Si Juan es mayor, salta a imprimir
    jb pepe_is_greater   ; Si Pepe es mayor, salta a imprimir

    ; Si las edades son iguales (aunque en este caso no se aplica, podr?as manejarlo aqu? si fuera necesario)

juan_is_greater:
    ; Imprime 'Juan es m?s grande que Pepe'
    mov ah, 09h
    lea dx, name1
    int 21h
    lea dx, msg1
    int 21h
    lea dx, name2
    int 21h
    lea dx, newline
    int 21h
    jmp end_program

pepe_is_greater:
    ; Imprime 'Pepe es m?s grande que Juan'
    mov ah, 09h
    lea dx, name2
    int 21h
    lea dx, msg1
    int 21h
    lea dx, name1
    int 21h
    lea dx, newline
    int 21h

end_program:
    ; Termina el programa
    mov ah, 4Ch
    int 21h
end main
