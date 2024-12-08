//Write a program in C to take two numbers from the user and print the
 //maximum between two numbers using a pointer
 #include <stdio.h>
 int main(){
 int num1,num2, max;
 int *p1,*p2;

 printf("The the num1  and num2 : ");
 scanf("%d""%d",&num1,&num2);
 p1=&num1;
 p2=&num2;

 if(*p1>*p2){
    max=*p1;
 }else{
    max=*p2;
 }
 printf("Maximum is :%d ",max);


 }
