
public class Shape {
    public double getPerimeter() {
        return 0.0; 
    }


    public double getArea() {
        return 0.0; 
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;

    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}


class oooo {
    public static void main(String[] args) {
        Circle circle = new Circle(5); 
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getArea());
    }

}

