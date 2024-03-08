// Write a Java program that calculates the simple interest on a loan. 
// Prompt the user to enter the principal amount, the rate of interest, and the time period. 
// Calculate and display the interest amount as a double.
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        // formula ptr/100

        double interest,principal,rate,time;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the Principal , Rate ,time");
        principal=input.nextDouble();
        rate=input.nextDouble();
        time=input.nextDouble();
        
        interest=(principal*rate*time)/100;

        System.out.println("The  simple Interests is :  " +interest);
        System.out.println("The rate is :  " +rate+  "%");
        System.out.println("The time  is :  " +time + "Year");
        System.out.println("The  principle is $ :  " +principal);

        input.close();

    }    
} 