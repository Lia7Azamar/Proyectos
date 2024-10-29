#include <stdio.h>

int main(){
    int a;
    int b;
    float r;
    printf("Cuanto tiempo llevas en la empresa \n");
    scanf("%d", &a);
    if(a>4){
         printf("Cuanto ganas al mes \n");
         scanf("%d", &b);
         r=b*.10;
         printf("Porcentaje sueldo %f\n",r);
        if(r>1000){
            printf("Usted esta sujeto a un credito hipotecario");
        }
    }
    
    

}