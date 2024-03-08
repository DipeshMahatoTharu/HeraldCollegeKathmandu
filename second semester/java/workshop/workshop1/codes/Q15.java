// Write a Java program that calculates and prints the sum, difference, product, and quotient of two given integers. 
// Take user input for two integers and display the results.
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sum,differnece,product,firstNumber ,SecondNumber;
        double quotient;
        System.out.print("Enter the first number :");
        firstNumber=input.nextInt();
        System.out.print("Enter the second number :");
        SecondNumber=input.nextInt();

        sum=firstNumber+SecondNumber;
        differnece=firstNumber-SecondNumber;
        product=firstNumber*SecondNumber;
        quotient=firstNumber/SecondNumber;

        System.out.println("The sum of Two given interger is : " +sum +"\n Difference is :" +differnece+ "\n And product is : "+product+"\nQuotient is : "+ quotient);
        input.close();
    }    
}
