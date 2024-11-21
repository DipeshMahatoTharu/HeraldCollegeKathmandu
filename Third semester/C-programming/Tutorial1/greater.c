// greater or smaller
#include <stdio.h>
int main(){
	int num1,num2,num3;
	printf("enter first number:");
	scanf("%d",&num1);

	printf("enter second number:");
	scanf("%d",&num2);

	printf("enter third number:");
	scanf("%d",&num3);


	if (num1>num2){
		printf("%d  is greater \n",num1);
	}
	else {
		printf("%d  is greater \n",num2);
	}

// for three number
	if (num1>num2 && num2>num3) {
		printf("%d  is greatest",num1);
	} else if (num2>num3 && num2>num1) {
		printf("%d  is greatest",num2);
	}else {
		printf("%d  is greatest",num3);

	}

}
