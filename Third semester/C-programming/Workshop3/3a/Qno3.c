/*Write a program to initialize an integer array with values {10,5,7,91,54,24}.
 Pass this array to a function. If element is found, print out its index number
 and if element is not found then display the message “Element Not found” in
 the function*/
#include <stdio.h>
void checkNum(int size,int arr[],int element){
    int found=0;
    for (int i=0;i<size;i++){
        if(arr[i]==element){
            printf("Element %d found in index %d",element,i);
            found=1;
            break;
        }

    }
    if(!found) {
        printf("Element not found");
        }

}


int main(){
int element[]={1,2,3,4,10};
int num=5;
int search;

printf("eneter the element to search ");
scanf("%d",&search);

checkNum(num,element,search);


}
