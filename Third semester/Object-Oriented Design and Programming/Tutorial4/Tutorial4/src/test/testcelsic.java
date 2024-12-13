package test; 
import static org.junit.jupiter.api.Assertions.assertEquals;
import demo.celcisusToFar;
public class testcelsic {
	public void calTest() {
		
	celcisusToFar cel=new celcisusToFar();
	double testresult= cel.convertCel(20);
	assertEquals(80, testresult);
	}
	
	
}
