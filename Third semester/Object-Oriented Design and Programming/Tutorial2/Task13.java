/*Task 14: 
Create a class AreaCalculator with method calculateArea and perform the following tasks:
Create an overloaded method named calculateArea to compute and display the area of a rectangle using length and width.
Overload the calculateArea method to calculate and display the area of a square using the side length.
Overload the calculateArea method again to calculate and display the area of a triangle using base and height.
*/ 

// complie time poly
class AreaCalculator{



    static double calculateArea(double length ,double width){
        return length*width;
    }
    static double calculateArea(double length ){
        return length*length;

    }
    static double calculateArea(double base ,double height,boolean isTrue){
        double area=0.5*(base*height);
        return area;

        
    }


    
}
public class Task13 {
    public static void main(String[] args) {
        double result = AreaCalculator.calculateArea(10,20);
        double result2 = AreaCalculator.calculateArea(30);
        double result3 = AreaCalculator.calculateArea(60,38,true);
        
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }
    
}
