//Set Operations
//8.Implement a TreeSet to store unique names in alphabetical order.

import java.util.Collections;
import java.util.TreeSet;

public class Ques8 {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet();
		names.add("Orange");
		names.add("Mango");
		names.add("Watermelon");
		names.add("Banana");
		names.add("Apple");
		
		System.out.println("Print the name in aplhabetical order: " + names);
	}
}
