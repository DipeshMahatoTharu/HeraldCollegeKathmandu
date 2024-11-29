//5. Write a program in C to convert decimal number to binary number using the function

#include <stdio.h>

int main (){
    int num=20;
    convert(num);
}

void convert(int num){
    if(num>1){
       convert(num/2);
    }
    printf("%d",num % 2);

}
