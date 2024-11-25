#include <stdio.h>

int main() {
    long fac = 1;
    int num;

    printf("Enter the number: ");
    scanf("%d", &num);

    if (num < 0) {
        printf("Factorial is not defined for negative numbers.\n");
    } else {
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }

        printf("The factorial of %d is %1d\n", num, fac);
    }

    return 0;
}
