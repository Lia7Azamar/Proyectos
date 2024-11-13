#include <stdio.h>

int main(){
    int numero=1;
 
    while (numero<=500){
        int a=numero*numero;
        int b=numero*numero*numero;
        printf ("%d, %d, %d, \n ", numero,a,b);
        numero++;
    }
    return 0;
    
  
}