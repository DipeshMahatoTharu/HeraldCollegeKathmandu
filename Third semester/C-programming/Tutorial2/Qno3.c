//Write a program in C to swap two numbers using function.

#include <stdio.h>

int main(){

int a ,b ;
a=10, b=12;
printf(swap(a,b));

}

int swap(int a,int b ,int c){
    c=a;
    a=b;
    b=c;
    printf("The sum after swaping is : %d %d", a,b);
}
