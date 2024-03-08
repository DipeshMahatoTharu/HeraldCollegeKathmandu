// Create a Java program that computes the area of a circle. Prompt the user to enter the radius and display the result as a double. 
// Use the formula (Area = π * r * r) for the calculation.
import java.util.Scanner;
public class Q12 {

   public static void main(String[] args) {
    double pi=3.16,Aera;
    int r;
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the radius :");
    r=input.nextInt();

     Aera= 2*pi*r*r;

     System.out.println("The aera is :" +Aera);
    
     input.close();

   } 
}
