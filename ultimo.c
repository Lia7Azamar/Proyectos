#include <stdio.h>

int main(){
    int arr[]={3,4,2,3,1,2,5,2,1,3,6,4,6,2,1,5,3,4,2,3};
    int arr2[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1};
    int i=0;
    float r;
    int m=1;
    while (i<20){
        r=r+arr[i];
        m=m*arr[i];
        i++;
    }

    
    printf("La suma del arreglo es %f El promedio del arreglo es %f\n ",r, r/20);
    printf("La multiplicacion de todos los elementos es %d\n ",m);

}