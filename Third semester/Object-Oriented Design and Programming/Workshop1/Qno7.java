/*  Develop a Java program that calculates the volume of a cylinder.
 Prompt the user to enter the radius and height of the cylinder and
 Object Oriented Programming and Design
  then display the result. Ensure that the program uses appropriate
  data types for calculation and output.
*/
import java.util.Scanner;
public class Qno7 {
    public static void main(String[] args) {
      double height,radius;
      Scanner sc=new Scanner(System.in);      
      System.out.print("Enter  radius :");
      radius=sc.nextDouble();
      System.out.print("Enter  height :");
      height=sc.nextDouble();
      
// V = πr^2h
    double volume=Math.PI*Math.pow(radius,2)*height;
    System.out.print("The valume of cylinder is : " + volume);


        sc.close();
    }
}
