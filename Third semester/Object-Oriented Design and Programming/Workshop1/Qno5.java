//  5. Write a Java program to calculate the area of a square. Prompt the
//  user to enter the length of one side and then display the result.
//  Ensure that the program handles user input as a double data type.
import java.util.Scanner;
public class Qno5 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double length,square;

    System.out.print("Enter the length :");
     length =sc.nextDouble();

    square=length*length;

    System.out.println("The length is :"+ square);

    sc.close();
   } 
}
