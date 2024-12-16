
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, i;
    int *arr1, *arr2, *arr3;

    printf("Enter the number of elements for the arrays: ");
    scanf("%d", &n);

    arr1 = (int *)malloc(n * sizeof(int));
    arr2 = (int *)malloc(n * sizeof(int));
    arr3 = (int *)malloc(n * sizeof(int));

    if (arr1 == NULL || arr2 == NULL || arr3 == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    printf("Enter elements for the first array:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr1[i]);
    }

    printf("Enter elements for the second array:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr2[i]);
    }

    for (i = 0; i < n; i++) {
        arr3[i] = arr1[i] + arr2[i];
    }

    printf("The resulting array after summation is:\n");
    for (i = 0; i < n; i++) {
        printf("%d ", arr3[i]);
    }
    printf("\n");

    free(arr1);
    free(arr2);
    free(arr3);

    return 0;
}
