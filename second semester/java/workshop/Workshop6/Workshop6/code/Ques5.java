//5.	Create a Stack to manage a sequence of tasks. Implement the following operations:
//a.	Push the tasks "Read", "Write", and "Code" onto the stack.
//b.	Pop a task from the stack.
//c.	Push tasks "Debug" and "Test" onto the stack.
//d.	Peek at the top task without removing it.
//e.	Print the stack.

import java.util.*;
public class Ques5 {
	public static void main (String[] args) {
		Stack<String> tasks = new Stack();
		tasks.push("Read");
		tasks.push("Write");
		tasks.push("Code");
		
		System.out.println("Task: " + tasks);
		
		tasks.pop();
		System.out.println("Popped Task: " + tasks);
		
		tasks.push("Debug");
		tasks.push("Test");
		System.out.println("Pushed Task: " + tasks);
		
		tasks.peek();
		System.out.println("Peeked Task: " + tasks );
		
	     
	}
}
