// Write a Java program that converts a given amount of money in U.S. dollars to another currency (e.g., rupees). 
// Prompt the user to enter the amount and the exchange rate, and display the converted amount as a double.
import java.util.Scanner;
public class Q14 {
   public static void main(String[] args) {
    double amount, exchangeRate ,conversionAmount;
    Scanner input =new Scanner(System.in);
    System.out.print("Enter the amount in us  : ");
    amount=input.nextDouble();
    System.out.print("Enter the exchange rate of your currency : ");
    exchangeRate=input.nextDouble();

    conversionAmount=amount*exchangeRate;


    System.out.println("The Conversion Amount is :" +conversionAmount);

    input.close();


   } 
}
