// Develop a Java program that converts miles to kilometers. Prompt the user to enter the distance in miles and display the equivalent distance in kilometers as a double.

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
       //formula for kilogram =miles*1.60934
       double kilogram, miles;
       Scanner input =new Scanner(System.in);
        System.out.println("Enter the miles ");
        miles=input.nextDouble();

        kilogram=miles*1.60934;
        System.out.println("The Kilogram is : "+ kilogram);
        input.close();
       
    }    
}
