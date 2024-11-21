// Calculate simple interest

#include <stdio.h>

int main (){
int p ,t ;
float r;
float interst;

printf("Enter the p :");
scanf("%d",&p);
printf("Enter the t :");
scanf("%d",&t);
printf("Enter the r :");
scanf("%f",&r);

interst=(p*t*r)/100;
printf("Simple interest is : %f",interst);

}
