package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import demo.Qno1;

public class CalcTest {
	@Test
	public void addTest() {
		Qno1 qn01 = new Qno1();
		int result = qn01.addTwoNUmbers(2, 2);
		assertEquals(5, result);
	}
}
