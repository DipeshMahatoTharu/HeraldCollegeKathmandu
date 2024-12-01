//Write a function that takes two integers as arguments and return the greatest among them.

#include <stdio.h>
void greater(int a, int b){
    if(a<b){
        printf("%d is greatest ",b);
    }else if (a>b){
    printf("%d is greatest",a);
    }else{
    printf("enter the valid number ");
    }

}

int main(){
 int num1,num2;
 printf("Enter the num and num2 :");
 scanf("%d""%d",&num1,&num2);

 greater(num1,num2);
}
