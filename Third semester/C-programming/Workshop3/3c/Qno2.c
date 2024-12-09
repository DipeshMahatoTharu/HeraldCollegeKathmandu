
/*Write a program to count and find the sum of all the numbers in the array,
 which are exactly divisible by 5 and not divisible by 2 and 3. Assign an array
 to a pointer. Print out address of pointer, array and first element of an array
 using “%p” formatter*/

 #include <stdio.h>

void findNumbers(int *arr, int size) {
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

    int *ptr = arr;  // Assign array to pointer

    printf("\nArray address: %p\n", (void *)arr);
    printf("Pointer address: %p\n", (void *)ptr);
    printf("Address of first element: %p\n", (void *)&arr[0]);

    findNumbers(ptr, n);

    return 0;
}
