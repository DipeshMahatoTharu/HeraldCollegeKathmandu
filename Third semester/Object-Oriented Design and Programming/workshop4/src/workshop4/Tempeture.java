/*Write tests for converting temperatures from Celsius to Fahrenheit and vice versa. */
package workshop4;
class Tempeture{
		
	public static double CelsicToFar(double Cel) {
		return (Cel * 9/5 )+32;		
	}
	public static double Fartocel(double Far) {
		return (Far - 32)*5/9;
	}
	
}
