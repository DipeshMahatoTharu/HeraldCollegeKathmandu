package workshop4;



class RectangleTest {

	public class Main {
	    public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(5, 3);
	        System.out.println("Area of rectangle: " + rectangle.calculateArea());
	        System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());
	        rectangle.setLength(7);
	        rectangle.setWidth(4);
	        System.out.println("Updated area of rectangle: " + rectangle.calculateArea());
	        System.out.println("Updated perimeter of rectangle: " + rectangle.calculatePerimeter());
	    }
	}

}
