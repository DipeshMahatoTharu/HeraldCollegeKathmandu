
#include <stdio.h>

void replaceWithFive(int arr[], int length) {
    for (int i = 0; i < length; i++) {
        arr[i] = 5;
    }
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

    printf("\nArray before replacement:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");


    replaceWithFive(arr, n);


    printf("\nArray after replacement with 5:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
