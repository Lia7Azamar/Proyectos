.model small
.stack
.data
cadena db "Las vocales$"
num equ $-cadena ; asigna a la variable el valor de cadena y no cambia en el programa
tiene db 10,13, "tiene un total de vocales$"
total db ?

.code ; Indica el segmento de c?digo

principal proc near ; Cambiado a proc near
    mov ax, SEG @data
    mov ds, ax

    mov si, 0
    mov dx, 0h
    mov cx, num

etiqueta:
    mov al, cadena[si]
    cmp al, 'a'
    je vocal
    cmp al, 'e'
    je vocal
    cmp al, 'i'
    je vocal
    cmp al, 'o'
    je vocal
    cmp al, 'u'
    je vocal

regresa:
    inc si
    loop etiqueta

    mov dh, 0
    mov total, dl
    mov ah, 09h
    lea dx, cadena
    int 21h

    mov ah, 09h
    lea dx, tiene
    int 21h

    mov ax, 0
    mov al, total
    aaa
    add ax, 3030h
    mov bx, ax

    mov ah, 02h
    mov dl, bh
    int 21h

    mov ah, 02h
    mov dl, bl
    int 21h

    ret ; Termina el procedimiento correctamente

vocal:
    inc dl
    jmp regresa

principal endp
end principal
