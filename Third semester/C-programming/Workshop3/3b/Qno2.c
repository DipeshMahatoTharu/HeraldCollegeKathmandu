
/*Write a program to count and find the sum of all the numbers in the array,
which are exactly divisible by 5 and not divisible by 2 and 3.
Assign an array to a pointer. Print out address of pointer, array and first element of an array
using “%p” formatter.*/

#include <stdio.h>
int main(){
int length,count=0,sum = 0;


printf("Enter the length of number : ");
scanf("%d",&length);

int arr[length];
int *ptr=arr;
for (int i= 0 ; i<length ; i++){
    scanf("%d",&arr[i]);
}

for(int i = 0 ;i <length ; i++){
    if(arr[i] % 5==0 && arr[i] % 2 !=0 && arr[i] % 3!=0){
            count++;
            sum += arr[i];
        }
}
printf("The count number is :%d\n",count);
printf("The sum of numbers is : %d\n",sum);

printf("The pointer is %p\n",&count);
printf("The pointter of sum is :%p\n",&sum);

}
