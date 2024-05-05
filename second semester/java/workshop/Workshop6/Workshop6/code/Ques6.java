//6.	Write a program that reverses the order of words in a sentence using a Stack. For example,
//if the input is "Hello World", the output should be "World Hello".

import java.util.*;
public class Ques6 {
	public static void main(String[]args) {
		String k = "Hello World";
		reverse(k);
	}
	static void reverse(String k)
	{
		Stack<String> s = new Stack<>();
		String[] token = k.split(" ");
		
		for (int i = 0;i<token.length;i++) {
			s.push(token[i]);
		}
		while(!s.empty()) {
			System.out.print(s.peek()+ " ");
			s.pop();
		}
	}

}
