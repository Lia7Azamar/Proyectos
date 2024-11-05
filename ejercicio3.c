#include <stdio.h>

int main(){
    int c=1;
    while (c<1000){
        if(c%2==0&&c%7==0){
            printf("%d\n",c);
        }
        c++;
    }
}