//3.	Rotate the elements of an ArrayList to the right by a given number of positions. For example, if the ArrayList is [1, 2, 3, 4, 5] and you rotate it by 2 positions, the result should be [4, 5, 1, 2, 3].

import java.util.ArrayList;
import java.util.Collections;

public class Ques3 {
	public static void main(String[] args) {
		ArrayList<Integer> position = new ArrayList();
		position.add(1);
		position.add(2);
		position.add(3);
		position.add(4);
		position.add(5);
		
		System.out.println("Array List: " + position);
		
		Collections.rotate(position, 4);
		System.out.println("Rotated list: " + position);
	}
}
