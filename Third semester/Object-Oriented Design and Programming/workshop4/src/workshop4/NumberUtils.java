package workshop4;


import java.util.ArrayList;

import java.util.List;



public class NumberUtils {

    
    public static List<Integer> getEvenNumbers(int[] numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public static void main(String[] args) {
      
        int[] input = {1, 2, 3, 4, 5, 6};
        System.out.println("Even numbers: " + getEvenNumbers(input));
    }

  
}
