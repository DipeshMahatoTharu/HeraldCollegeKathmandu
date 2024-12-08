/*Write a program to take three numbers from the user and save it in three
 different variables. You must swap the value of three numbers using
 function. You must use call by references*/

 #include <stdio.h>
 void swapNum(int *a, int *b ,int *c){
 int temp;
 temp=*a;
 *a=*b;
 *b=*c;
 *c=temp;



 }


 int main (){
 int num1,num2,num3;

 printf("Enter 3 num : ");
 scanf("%d""%d""%d",&num1,&num2,&num3);

 swapNum(&num1,&num2,&num3);

printf("Swaping %d\n",num1);
printf("Swaping %d\n",num2);
printf("Swaping %d\n",num3);



 }
