//12.	Write a program that sorts an array of integers using the sort() method. Also try sorting in reverse order.

import java.util.Arrays;

public class Ques12{
    public static void main(String[] args) {
        // Array of integers
        int[] numbers = {5, 2, 9, 1, 7};

        // Sort array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));

        // Sort array in descending order
        reverseSort(numbers);
        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));
    }

    // Method to sort array in descending order
    public static void reverseSort(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
}
