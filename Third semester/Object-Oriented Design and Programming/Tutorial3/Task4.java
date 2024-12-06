
interface Shape {
    double calculateArea();      
    double calculatePerimeter(); 
}


class Circle implements Shape {
    private double radius;

 
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; 
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; 
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width; 
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width); 
    }
}

// Main class
public class Task4{
    public static void main(String[] args) {
      
        Shape circle = new Circle(5); 

  
        Shape rectangle = new Rectangle(4, 7); 

     
        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());


        System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
    }
}