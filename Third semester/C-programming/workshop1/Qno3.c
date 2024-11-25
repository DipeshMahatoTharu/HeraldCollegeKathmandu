//Write a program to print out all triangular numbers from 1 up to nth term formula (i * (i + 1)) / 2

#include <stdio.h>

int main(){
    int num;
    int result;
    printf("Enter the number : ");
    scanf("%d",&num);

if(num<0){
    printf("Enter non-positive num");
}else{
    for(int i=1 ; i<=num ; i++){
         result=(i*(i+1))/2;
        printf("%d ",result);
    }

}






}
