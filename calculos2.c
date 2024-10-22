#include <stdio.h>

int main(){
    double a=0.25;
    int b=2;
    int c=1;
    int d=5;
    double r=b-a;
    r=b/r+c;
    r=c/r;
    r=b/r+d;

    printf("El resultado es %f\n",r);
}