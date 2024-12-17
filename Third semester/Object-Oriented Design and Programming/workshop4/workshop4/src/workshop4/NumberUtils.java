package workshop4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class NumberUtils {

    // Method to filter and return only even numbers from a given array of integers
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
        // Example usage
        int[] input = {1, 2, 3, 4, 5, 6};
        System.out.println("Even numbers: " + getEvenNumbers(input));
    }

    @Test
    void testEvenNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};
        List<Integer> expectedOutput = Arrays.asList(2, 4, 6); 

        List<Integer> actualOutput = NumberUtils.getEvenNumbers(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
