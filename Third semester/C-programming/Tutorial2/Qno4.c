
//  Write a program in C to check a given number is even or odd using the function.


#include <stdio.h>
int main (){
int num;

printf("Enter the num : ");
scanf("%d",&num);

oddEven(num);



}
 int oddEven(int a){
     if(a %2 == 0){
        printf("number is even ");
        }else {
            printf("number is  odd");
        }
     }

