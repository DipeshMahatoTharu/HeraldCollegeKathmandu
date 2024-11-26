/*
  Write a Java program that calculates the perimeter of a rectangle.
 Prompt the user to enter the length and width of the rectangle, and
 then display the result. Use appropriate data types for calculation and
 output
 */
import java.util.Scanner;
public class Qno10 {
    public static void main(String[] args) {
        // 2(l+b)
        double length,width,perimeter;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length and width : ");
        length=sc.nextDouble();
        width=sc.nextDouble();

        perimeter=2*(length+width);

        System.out.print("The perimeter is :  "+perimeter);
        
        sc.close();
        
    }
}
