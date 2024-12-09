/* Write a program to initialize an integer array with values {20, 15, 87, 71, 24,
 34}. Pass this array to a function. Take input from a user to search a number
 from an array. If element is found, print out its index number and if element
 is not found then display the message “Element Not found” in the function.*/
 #include <stdio.h>

void searchElement(int arr[], int size, int key) {
    int found = 0;
    for (int i = 0; i < size; i++) {
        if (arr[i] == key) {
            printf("Element %d found at index %d\n", key, i);
            found = 1;
            break;
        }
    }
    if (!found) {
        printf("Element Not found\n");
    }
}

int main() {
    int arr[] = {20, 15, 87, 71, 24, 34};
    int size = sizeof(arr) / sizeof(arr[0]);
    int key;

    printf("Enter the number to search: ");
    scanf("%d", &key);

    searchElement(arr, size, key);

    return 0;
}

