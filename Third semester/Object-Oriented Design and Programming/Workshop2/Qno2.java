/*Method Overriding: 

Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
 Create a subclass called Circle that overrides the getPerimeter() and getArea() methods 
 to calculate the area and perimeter of a circle. */ 

 class Shape{

    public void getPerimeter(double radius){
        System.out.println("Perimeter : " + 2 * Math.PI*radius);

    }
    public void getArea(double radius){
        System.out.println("Area :" +Math.PI*radius*radius);
        
    }

 }
class Circle extends Shape{
   @Override
    public void getPerimeter(double radius){
        super.getPerimeter(radius);
    }
    public void getArea(double radius){
        super.getArea(radius);
    }

 }
public class Qno2 {

    public static void main(String[] args) {
       Circle circle= new Circle();
       circle.getPerimeter(42);
       circle.getArea(20);
       
    }
    
}
