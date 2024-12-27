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
