//1.	Create an ArrayList to store the names of students in a class. Add, remove, and print the list of students.
//●	Initialize an empty ArrayList to store examinee names.
//●	Add the names of five examinee participating in the exam to the ArrayList.
//●	Remove the name of the examinee who withdrew from the exam.
//●	Print the updated list of participants.

import java.util.ArrayList;
public class Ques1 {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList();
		students.add("Dipesh");
		students.add("roshan");
		students.add("weqwwrw");
		students.add("sadas");
		students.add("eqwweq");
		
		System.out.println("examinee list: " + students);
		
		students.remove(0);
		System.out.println("participants list: " + students);
		
		
	}
}
