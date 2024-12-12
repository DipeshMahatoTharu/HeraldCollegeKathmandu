/*
 Write a program to replace each element in an array with the integer value

5.You must take input from users in the main function and save it in an array.
You must also take the size of an array from the user. You must create a
function that takes two parameters: an array and length of the array. Your
function should not return anything and it should not print anything. You
must print before and after replacing an element in an array in the main
function.
*/
#include <stdio.h>
void replaceFive(int arr[],int length){
    for(int i =0 ;i<length ;i++){
        arr[i]=5;
    }
}
int main(){
    int number;


    printf("Enter the length of array  : ");
    scanf("%d",&number);

    int num[number];

    for(int i =0 ;i<number ; i++){
        printf("Enter the array %d :",i+1);
        scanf("%d",&num[i]);
    }
    printf("Before replacing \n");
    for(int i=0 ; i<number ; i++){
        printf("%d \n",num[i]);
    }
    printf("\n");

    replaceFive(num,number);

    printf("after replacing \n");
    for(int i =0 ; i<number ; i++){
        printf("%d \n",num[i]);
    }


}













/*
#include <stdio.h>

void replaceWithFive(int arr[], int length) {
    for (int i = 0; i < length; i++) {
        arr[i] = 5;
    }
}
int main() {
    int n;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];


    printf("Enter %d elements of the array:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("\nArray before replacement:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");


    replaceWithFive(arr, n);


    printf("\nArray after replacement with 5:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
*/
