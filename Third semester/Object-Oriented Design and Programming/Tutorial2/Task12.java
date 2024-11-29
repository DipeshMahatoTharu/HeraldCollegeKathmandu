// Create a subclass Rectangle that inherits from Shape and adds attributes length and width.
class Rectangle extends Shape{
    double length;
    double width;
    
    @Override
    public void area(){
        super.area();       
    }
    //Use super() to initialize the color attribute in the Rectangle constructor.

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
        this.color=super.color;
        
    }

    public double calculate(){
        return length*width;
    }
    
  
}
public class Task12 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(21,21);
        rectangle.area();
    
        double result =rectangle.calculate();
        rectangle.color="red";
        System.out.println("The output is :"+result);
        System.out.println("colour "+ rectangle.color);
      


    }
}
