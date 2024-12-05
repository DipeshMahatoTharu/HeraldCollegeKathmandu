//WAP to swap the number using a pointer(call by value and call by
//reference).

#include <stdio.h>

// Function to swap numbers using Call by Value
void swapByValue(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    printf("Inside swapByValue: a = %d, b = %d\n", a, b);
}

// Function to swap numbers using Call by Reference
void swapByReference(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    int num1, num2;

    // Input numbers
    printf("Enter two numbers:\n");
    printf("Number 1: ");
    scanf("%d", &num1);
    printf("Number 2: ");
    scanf("%d", &num2);

    // Display initial values
    printf("\nBefore swapping: num1 = %d, num2 = %d\n", num1, num2);

    // Call swapByValue
    printf("\nUsing Call by Value:\n");
    swapByValue(num1, num2);
    printf("After swapByValue: num1 = %d, num2 = %d\n", num1, num2);

    // Call swapByReference
    printf("\nUsing Call by Reference:\n");
    swapByReference(&num1, &num2);
    printf("After swapByReference: num1 = %d, num2 = %d\n", num1, num2);

    return 0;
}

