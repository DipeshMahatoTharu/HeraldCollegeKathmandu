
#include <stdio.h>

int isPrime(int num) ;

int main() {
    int number;

    printf("enter the number: ");
    scanf("%d",&number);

    if (isPrime(number)) {
        printf("%d is prime number \n",number);
    }else {
        printf("%d is not prime number \n",number);
    }
    return 0;

}
int isPrime(int num) {
    if (num <=1){
        return 0;
    }
       for (int i = 2; i<=num/2;i++) {
             if (num%i==0) {
            return 0;
        }
    }

    return 1;
}
