/* Finding maximum in an array using
 dynamic memory allocation*/

 #include <stdio.h>
#include <stdlib.h>

int main() {
    int n, i, *arr, max;
    printf("Enter the number of elements: ");
    scanf("%d", &n);

    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) return 1;

    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    max = arr[0];
    for (i = 1; i < n; i++) {
        if (arr[i] > max) max = arr[i];
    }

    printf("Maximum element is: %d\n", max);
    free(arr);
    return 0;
}
