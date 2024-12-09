/* Write a program to count and find the sum of all the numbers in the array
 which are exactly divisible by 5 and not divisible by 2 and 3*/
#include <stdio.h>

void findNumbers(int arr[], int size) {
    int count = 0, sum = 0;

    for (int i = 0; i < size; i++) {
        if (arr[i] % 5 == 0 && arr[i] % 2 != 0 && arr[i] % 3 != 0) {
            count++;
            sum += arr[i];
        }
    }

    printf("Count of numbers: %d\n", count);
    printf("Sum of numbers: %d\n", sum);
}

int main() {
    int n;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements of the array:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    findNumbers(arr, n);

    return 0;
}
