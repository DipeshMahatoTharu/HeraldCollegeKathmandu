//4.	Write a program to declare a linkedList, colors to store String. Insert five colors into the linked list. 
//a.	Iterate and print all the colors.
//b.	Check if “Red” exists in the linkedList or not.
//c.	Shuffle the elements of the list and print them.
//d.	Print the LinkedList in ascending order

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class Ques4 {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Purple");
		colors.add("Brown");
		
		Iterator itr = colors.iterator();
		while(itr.hasNext() ) {
			System.out.println("colors : " + itr.next());
		}
		
		boolean redExists = colors.contains("Red");
        System.out.println("Does 'Red' exist in the list? " + redExists);
        
        Collections.shuffle(colors);
        System.out.println("Shuffled colors: " + colors); 
  
        
        Collections.sort(colors);
        System.out.println("Sorted colors: " + colors);
		
		
	}
}
