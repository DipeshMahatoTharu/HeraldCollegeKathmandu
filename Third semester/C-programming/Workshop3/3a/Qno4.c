/* Write a program to read three integers using an array and find the smallest
 and largest among them.You must write a function for finding the largest and
 smallest integer and the result must be displayed in the main function itself.
 You are not allowed to create global variables*/

 #include <stdio.h>
 void findLarSmall(int num[],int *min,int *max,int size ){
     *min=num[0];
     *max=num[0];//30
//{10,20,30} 20<10 ,30<10
     for(int i=1; i<size; i++ ){
        if(num[i]<*min ){
           *min=num[i];
        }
    //20> 10   30>20 ;
        if(num[i]>*max){
            *max=num[i];
        }
     }
 }

 int main (){
     int array[3];
     int min,max;

    printf("Enter 3 integer : ");
    for(int i =0 ;i<3; i++){
        scanf("%d",&array[i]);
    }
    findLarSmall(array,&min,&max,3);

    printf("The min is :%d\n",min);
    printf("The max is :%d",max);





 }
