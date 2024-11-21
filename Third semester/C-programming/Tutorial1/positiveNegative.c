// print numbers and positive numbers from 1 to 100.

#include <stdio.h>
int main(){
	int num;

	printf("numbers from 1 to 100:");

	for(num=1; num<=100; num++){
		printf("%d ",num);
	}
	printf("\n");

	printf("all even numbers from 1 to 100: \n ");
	for(num=1; num<=100; num++){
		if (num%2==0){
			printf("%d ",num);
		}
	}
	printf("\n");

}
