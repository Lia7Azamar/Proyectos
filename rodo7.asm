CR EQU 13          ; Definici?n de la constante CR (Carriage Return) con valor 13
LF EQU 10          ; Definici?n de la constante LF (Line Feed) con valor 10

DATOS SEGMENT      ; Inicio del segmento de datos
    NUM1 DB '25',CR,LF,'$'   ; Primer n?mero de dos d?gitos
    NUM2 DB '48',CR,LF,'$'   ; Segundo n?mero de dos d?gitos
DATOS ENDS         ; Fin del segmento de datos

PILA SEGMENT STACK  ; Inicio del segmento de pila
    DB 64 DUP('PILA') ; Reserva 64 bytes en la pila
PILA ENDS           ; Fin del segmento de pila

CODIGO SEGMENT     ; Inicio del segmento de c?digo

    LN PROC FAR    ; Declaraci?n del procedimiento LN
    ASSUME CS:CODIGO, DS:DATOS, SS:PILA  ; Asignaci?n de segmentos
    MOV AX, DATOS  ; Carga la direcci?n base del segmento de datos en AX
    MOV DS, AX     ; Mueve el valor de AX al registro DS

    ; Despliega el primer n?mero
    LEA DX, NUM1   ; Carga la direcci?n de NUM1 en DX
    CALL ESCRIBE   ; Llama al procedimiento para mostrar NUM1

    ; Despliega el segundo n?mero
    LEA DX, NUM2   ; Carga la direcci?n de NUM2 en DX
    CALL ESCRIBE   ; Llama al procedimiento para mostrar NUM2

    MOV AX, 4C00H  ; Carga el c?digo de funci?n 4Ch en AX para finalizar el programa
    INT 21H        ; Interrupci?n 21H para terminar el programa
    
    LN ENDP        ; Fin del procedimiento LN

    ESCRIBE PROC   ; Procedimiento para escribir en pantalla
    MOV AH, 9      ; Carga el c?digo de funci?n 9 en AH (mostrar cadena)
    INT 21H        ; Interrupci?n 21H para mostrar la cadena apuntada por DX
    RET            ; Retorno del procedimiento
    ESCRIBE ENDP   ; Fin del procedimiento ESCRIBE

CODIGO ENDS        ; Fin del segmento de c?digo

END LN             ; Fin del programa
