#include <stdio.h>

int main(){
    int Arr[100];
    int i=0;
    int a=1;
    
    while (i<100){
        while (a<10){
            printf("%d * %d = %d\n",a,i,a*i);
            a++;
        }
    
        i++;
        
    }
    

}