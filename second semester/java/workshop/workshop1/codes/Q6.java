// Create a Java program that converts a temperature in Celsius to Fahrenheit. 
// Prompt the user to enter the temperature in Celsius, perform the conversion using the formula (F = C * 9/5 + 32), and display the result as a double.
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        double Celsius , Fahrenheit;
        Scanner input =new Scanner(System.in);
        System.out.println("enter the Celsius");
        Celsius=input.nextDouble();

        Fahrenheit=(Celsius*9/5 + 32);

        System.out.println("The Fahrenheit is : "+Fahrenheit);

        input.close();


    }
}
