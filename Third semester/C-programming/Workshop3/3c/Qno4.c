/*Write a program to read three integers using an array and find the smallest
 and largest among them. You must write a function for finding the largest
 and smallest integer and the result must be displayed in the main function
 itself. You are not allowed to create global variables
*/
#include <stdio.h>

void findSmallestAndLargest(int arr[], int size, int *smallest, int *largest) {
    *smallest = arr[0];
    *largest = arr[0];

    for (int i = 1; i < size; i++) {
        if (arr[i] < *smallest) {
            *smallest = arr[i];
        }
        if (arr[i] > *largest) {
            *largest = arr[i];
        }
    }
}

int main() {
    int arr[3], smallest, largest;

    printf("Enter three integers:\n");
    for (int i = 0; i < 3; i++) {
        scanf("%d", &arr[i]);
    }

    findSmallestAndLargest(arr, 3, &smallest, &largest);

    printf("Smallest number: %d\n", smallest);
    printf("Largest number: %d\n", largest);

    return 0;
}
