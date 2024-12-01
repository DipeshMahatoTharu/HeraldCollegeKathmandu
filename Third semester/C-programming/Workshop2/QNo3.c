// Write a void function which takes one integer (n) as a parameter. Your function should
//then print out all triangular numbers from 1 up to the nth term.
#include <stdio.h>
void traingular(int n){
    for (int i; i<=n; i++){
        int sum=i*(i+1)/2;
        printf("%d ",sum);
    }

}


int main(){
    int num;
    printf("Enter the value :");
    scanf("%d",&num);

    traingular(num);
}

