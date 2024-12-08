#include <stdio.h>

// Function to calculate sum, multiplication, quotient, subtraction, and minimum
void calculator(int *a, int *b, int *c, int *sum, int *mul, int *quotient, int *diff, int *min) {

    *sum = *a + *b + *c;


    *mul = (*a) * (*b) * (*c);


    if (*b != 0 && *c != 0) {
        *quotient = *a / *b / *c;
    } else {
        *quotient = 0;
    }

    *diff = *a - *b - *c;

    // Minimum value
    if (*a < *b && *a < *c) {
        *min = *a;
    } else if (*b < *a && *b < *c) {
        *min = *b;
    } else {
        *min = *c;
    }
}

int main() {
    int num1, num2, num3;
    int sum, mul, quotient, diff, min;


    printf("Enter three numbers: ");
    scanf("%d %d %d", &num1, &num2, &num3);


    calculator(&num1, &num2, &num3, &sum, &mul, &quotient, &diff, &min);

    printf("Sum: %d\n", sum);
    printf("Multiplication: %d\n", mul);
    printf("Quotient: %d\n", quotient);
    printf("Subtraction: %d\n", diff);
    printf("Minimum: %d\n", min);

    return 0;
}
