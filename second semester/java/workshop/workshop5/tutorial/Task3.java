abstract class Shape {
    abstract double getRectangleArea(double length, double width);
    abstract double getSquareArea(double side);
    abstract double getCircleArea(double radius);
}

class Area extends Shape {
    double getRectangleArea(double length, double width) {
        return length * width;
    }

    double getSquareArea(double side) {
        return side * side;
    }

    double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Area area = new Area();

        double rectangleArea = area.getRectangleArea(5, 10);
        double squareArea = area.getSquareArea(6);
        double circleArea = area.getCircleArea(4);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
