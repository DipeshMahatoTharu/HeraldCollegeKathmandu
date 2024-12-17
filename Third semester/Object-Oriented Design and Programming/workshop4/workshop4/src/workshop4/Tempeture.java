/*Write tests for converting temperatures from Celsius to Fahrenheit and vice versa. */
package workshop4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Tempeture {
	
	
	
	public static double CelsicToFar(double Cel) {
		
		return (Cel * 9/5 )+32;
		
	}
	public static double Fartocel(double Far) {
		return (Far - 32)*5/9;
	}
	@Test
	void test() {
		assertEquals(32,Tempeture.CelsicToFar(0));
		assertEquals(0,Tempeture.Fartocel(11));
	}

}
