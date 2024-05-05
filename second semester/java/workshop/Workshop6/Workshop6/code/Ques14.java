//Write a program to initialize an ArrayList with a set of integers.
//Implement a binary search algorithm to find a particular integer.

import java.util.ArrayList;
import java.util.Collections;

public class Ques14 {
	   public static void main(String[] args) {
	       ArrayList<Integer> numbers = new ArrayList<>();
	       numbers.add(2);
	       numbers.add(4);
	       numbers.add(6);
	       numbers.add(8);
	       numbers.add(10);
	       numbers.add(12);
	       numbers.add(14);
	       numbers.add(16);
	       numbers.add(18);
	       numbers.add(20);

	       // Target integer to search for
	       int target = 12;

	       // Perform binary search
	       int index = Collections.binarySearch(numbers, target);

	       // Print the result
	       if (index >= 0) {
	           System.out.println("The integer " + target + " is found at index: " + index);
	       } else {
	           System.out.println("The integer " + target + " is not found in the list.");
	       }
	    }

}
