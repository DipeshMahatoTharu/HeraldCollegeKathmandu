public class Ques4 {
    public static void main(String[] args) {
        int[] arr = { 11, 13, 5, 10, 12 };

        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nSorted array in ascending order:");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

