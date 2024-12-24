package wotkshop5;
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class Qno5 {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw();

        Drawable rectangle = new Rectangle();
        rectangle.draw();

        Drawable triangle = new Triangle();
        triangle.draw();
    }
}
