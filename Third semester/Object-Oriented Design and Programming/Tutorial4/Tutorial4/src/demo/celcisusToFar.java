package demo;
class Convert{
	double far;
	double celsic;
}


public class celcisusToFar {
	public double convertCel(double far) {
		return (far - 32) * 5/9;
	}
	public static void main(String[] args) {
		Convert convert =new Convert();
	}
}
