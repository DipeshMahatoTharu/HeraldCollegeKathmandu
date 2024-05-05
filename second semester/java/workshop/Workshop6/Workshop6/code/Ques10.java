//10.	Write a program that uses a HashMap to store contact information (name and phone number).

import java.util.HashMap;
import java.util.Map;


public class Ques10 {
 public static void main (String[] args) {
	 HashMap<String , Integer> information = new HashMap();
	 information.put("Shreya", 98245899);
	 information.put("Aayusha",11234556);
	 information.put("Shikha", 23455634);
	 information.put("Bandana",41234556);
	 
	 System.out.println("Contact Information: ");
	 for (Map.Entry m: information.entrySet()) {
		 System.out.println(m.getKey() + " " + m.getValue());
	 }
	 
	
	
	 
 }
}
