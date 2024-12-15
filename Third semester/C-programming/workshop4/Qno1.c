/*1. C program to create memory for int,
 char and float variables at run time.*/
#include <stdio.h>
#include <stdlib.h>

 int main(){
    char *ptrchar;
    int *ptrint;
    float *ptrfloat;

    ptrchar = (char *)malloc(sizeof(char));
    ptrint=(int *)malloc(sizeof(int));
    ptrfloat=(float *)malloc(sizeof(float));

    if(ptrchar==NULL || ptrint==NULL || ptrfloat==NULL){
        printf("memeory allocation failed ");
        return 1;
    }

 *ptrchar='A';
 *ptrint=21;
 *ptrfloat=2.3;

 printf("The char is : %c\n",*ptrchar);
 printf("The int is : %d\n",*ptrint);
 printf("The flaot is ; %.2f\n",*ptrfloat);

 free(ptrchar);
 free(ptrint);
 free(ptrfloat);

 }
