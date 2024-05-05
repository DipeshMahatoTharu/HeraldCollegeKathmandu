//2.	Write a program to insert elements into the linked list at the first and last positions. Also check if the linked list is empty or not.

import java.util.Iterator;
import java.util.LinkedList;

public class Ques2 {
	public static void main(String[] args) {
		LinkedList<String> elements = new LinkedList();
		elements.add("hello");
		elements.add("Heyy");
		elements.add("Bye");
		elements.add("hi");
		
		System.out.println("first elements: " + elements);
		elements.addFirst("ritisha");
		elements.addLast("rozina");
		
		System.out.println("added elements: " + elements);
		
		if (elements.isEmpty()) {
			System.out.println("list is empty");
		}else {
			System.out.println("List is not empty");
		}
		
//		Iterator itr = elements.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
	}
}
