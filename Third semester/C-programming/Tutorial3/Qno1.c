//1. WAP to find the largest element of an array.
#include <stdio.h>
int main(){
 int num[]={2,6,1,7,3,2};
 int n= 6;
 int largest= num[0];

 for (int i =1 ; i<n ; i++){
    if (num[i] > largest){
        largest = num[i];
    }
 }

 printf("The largest number is : %d ",largest);

}
