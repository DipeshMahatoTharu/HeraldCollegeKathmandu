//Queue
//7.	Imagine a scenario where a printer is managing print jobs. Create a Queue to handle these print jobs. Implement the following operations:
//●	Enqueue print jobs "Document1", "Document2", and "Document3" into the print queue.
//●	Dequeue a print job from the front of the queue.
//●	Enqueue print jobs "Document4" and "Document5" into the print queue.
//●	Peek at the next print job without removing it.
//●	Print the list of print jobs in the queue.

import java.util.LinkedList;
import java.util.Queue;

public class Ques7 {
	public static void main(String[] args) {
		Queue<String> jobs = new LinkedList();
		jobs.offer("Document1");
		jobs.offer("Document2");
		jobs.offer("Document3");
		System.out.println("Enqueue: " + jobs);
		
		jobs.poll();
		System.out.println("Dequeue: " + jobs);
		
		jobs.offer("Document4");
		jobs.offer("Document5");
		System.out.println("Enequeue2: " + jobs);
		
		jobs.peek();
		System.out.println("Peeked: " + jobs);
		
		System.out.println("List: " + jobs);
	}
}
