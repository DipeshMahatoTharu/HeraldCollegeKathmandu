/* Write a program in C to take two numbers from the user and print the
 minimum between two numbers using a pointer.
 */
#include <stdio.h>

void findMinimum(int *a, int *b) {
    if (*a < *b) {
        printf("The minimum number is: %d\n", *a);
    } else {
        printf("The minimum number is: %d\n", *b);
    }
}

int main() {
    int num1, num2;

    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);

    findMinimum(&num1, &num2);

    return 0;
}
