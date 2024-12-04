//WAP to read 10 numbers from keyboard to store these num into
//array and then calculate sum of these num using function
#include <stdio.h>
int sum(int num[],int n){
    int result = 0;
     for (int i=0 ; i<n ; i++){
        result += num[i];
     }

return result;
}

int main(){
     int n=10 ;
     int num[10];

    for (int i=0 ; i<n ; i++){
    printf("Enter the element in index your array %d: ",i+1);
    scanf("%d",&num[i]);
    }
    printf("The result is :%d",sum(num,n));
}

