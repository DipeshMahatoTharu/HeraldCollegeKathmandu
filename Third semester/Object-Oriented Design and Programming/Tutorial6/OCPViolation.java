/*Explanation of Violation:
When a class requires modifications to support new functionality, it violates OCP.
 This increases the risk of introducing bugs and makes the code less maintainable.*/
 //he ShapeWithoutOCP class requires modification whenever a new shape is added, violating OCP. 
 //In the correct implementation, new shapes can be added as subclasses without modifying the base class.
class ShapeWithoutOCP {
    public void draw(String shapeType) {
        if (shapeType.equals("Circle")) {
            System.out.println("Drawing Circle");
        } else if (shapeType.equals("Rectangle")) {
            System.out.println("Drawing Rectangle");
        }
    }
}

class OCPViolation {
    public static void main(String[] args) {
        ShapeWithoutOCP shape = new ShapeWithoutOCP();
        shape.draw("Circle");
        shape.draw("Rectangle");
    }
}
