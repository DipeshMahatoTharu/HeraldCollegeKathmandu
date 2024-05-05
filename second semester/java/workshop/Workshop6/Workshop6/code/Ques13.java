//Write a program that sorts an array  list of strings of colors using the sort() method. Also try sorting in reverse order.

import java.util.ArrayList;
import java.util.Collections;

public class Ques13 {
	  public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        Collections.sort(colors);
	        System.out.println("Sorted colors in ascending order: " + colors);

	        Collections.sort(colors, Collections.reverseOrder());
	        System.out.println("Sorted colors in descending order: " + colors);
	    }
}
	

