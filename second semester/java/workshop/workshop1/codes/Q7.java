// Develop a Java program that calculates the volume of a cylinder. Prompt the user to enter the radius and height of the cylinder and then display the result. Ensure that the program uses appropriate data types for calculation and output.
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // formula pi*r*r*h
        Scanner input =new Scanner(System.in);
        double pi,r,h,Aera;
        pi=3.14;
        System.out.println("Enter the Radius");
        r=input.nextDouble();
        System.out.println("Enter the height");
        h=input.nextDouble();

        Aera=pi*r*r*h;
        System.out.println("The aera of cylinder is : "+Aera);
        input.close();
        
    }
    
}
