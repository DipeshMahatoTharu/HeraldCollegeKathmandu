/* Create a class Rectangle with fields for width and height. Add a
 constructor to initialize these fields. Override the toString() method to
 return the rectangle's dimensions in a readable format*/ 

 class Rectangle{
    double width;
    double height;

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;

    }
@Override
    public String toString(){
        return("Width is :"+width+", Height is : "+height);
    }
 }
public class Qno17 {
    public static void main(String[] args) {    
    Rectangle rectangle1=new Rectangle(20, 89);
    Rectangle rectangle2=new Rectangle(60, 81);
    Rectangle rectangle4=new Rectangle(69, 96);

    System.out.println(rectangle1);
    System.out.println(rectangle2);
    System.out.println(rectangle4);
        
    }
}
