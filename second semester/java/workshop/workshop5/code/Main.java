
//abstract class
abstract class Shape{
	//abstract-methods
	abstract void calculateArea(double length,double breadth);
	abstract void calculatePerimeter(double length,double breadth);
}
class Quadrilateral extends Shape{
	double area,perimeter;
	double areaS,perimeterP;
	@Override
	void calculateArea(double length,double breadth){
		area=length*breadth;
		areaS=Math.pow(breadth,2);
		System.out.println("Area of rectangle is"+area);
		System.out.println("Area of square is"+areaS);
	}
	@Override
	void calculatePerimeter(double length,double breadth){
		perimeter=2*(length+breadth);
		System.out.println("Perimeter of rectangle is"+perimeter);
	}
}
public class Main {
	public static void main(String[] args) {
		Quadrilateral s=new Quadrilateral();
		s.calculateArea(10,10);  
		s.calculatePerimeter(10,10);

	}

}
