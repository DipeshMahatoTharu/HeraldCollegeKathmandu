//Write a program to input a character from the user and print it in lowercase. If the
//character is in uppercase then you have to change it in lowercase and if it is in
//lowercase then you have to print as it is

#include <stdio.h>
#include <ctype.h>
int main(){
char n;
printf("Enter the Charater :");
scanf("%c",&n);

if(n >= 'A' && n <='Z'){
    printf("The users upper chase is : %c ",toupper(n));

}else{
    printf("The charater is lower already :%c",n);
}





return 0;
}
