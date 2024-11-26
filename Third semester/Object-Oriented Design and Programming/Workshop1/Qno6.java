// Create a Java program that converts a temperature in Celsius to
// Fahrenheit.
//  Prompt the user to enter the temperature in Celsius,
// perform the conversion using the formula (F = C * 9/5 + 32), and
// display the result as a double.
import java.util.Scanner;
public class Qno6 {
    public static void main(String[] args) {
        double temperature,celsius;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the temp");
        celsius=sc.nextDouble();

        temperature=(celsius*9/5) +32;
        System.out.println("The temp is : "+ temperature);
        sc.close();
        
    }
}
