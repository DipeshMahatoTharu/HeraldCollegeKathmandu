// Implement a class Shape with attributes color and method area().
class Shape{
    String color;


    public void area(){
        System.out.println("Area");
    }
}
public class Task11 {
    public static void main(String[] args) {
    Shape shape=new Shape();
     shape.area();
     shape.color="red";
     System.out.println(shape.color);
    }
    
}
