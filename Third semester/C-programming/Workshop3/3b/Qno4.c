/* Add a new function in the program you have created in Qno. 3 which takes
 three parameters: an array, length of the array and value to replace each
 element in an array. You must receive an integer value in the main function.
 Your function should not return anything and it should not print anything.
 You must print a new array in the main function*/

#include <stdio.h>

void replaceWithValue(int arr[], int length, int value) {
    for (int i = 0; i < length; i++) {
        arr[i] = value;
    }
}

int main() {
    int n, value;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements of the array:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter the value to replace each element with: ");
    scanf("%d", &value);

    replaceWithValue(arr, n, value);

    printf("\nArray after replacement with %d:\n", value);
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
