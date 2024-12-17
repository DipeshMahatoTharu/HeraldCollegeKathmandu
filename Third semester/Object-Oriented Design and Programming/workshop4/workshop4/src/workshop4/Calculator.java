/* Write a simple method in a Calculator class that adds two integers. 
 * Then, create a JUnit 
test case to verify that the method works correctly by adding two numbers together. */
package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculator {
	
	public int Add(int num1, int num2) {
		return num1+num2;
	}
	

	@Test
	void test() {
		assertEquals(10,Add(5 ,5));
	}

}
