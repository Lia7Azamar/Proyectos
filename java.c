#include <stdio.h>
//arreglos
int main(){

    int vector [10];
    int i = 0;
    int val=10;

    while (i<10){
        vector[i]=val;
        //printf("El valor del vector [%d] = %d\n",i,val);
        i++;
    }
    i=0;
    while (i<10){
        printf("El vector [%d]= %d\n",i, vector[i]);
    }
}