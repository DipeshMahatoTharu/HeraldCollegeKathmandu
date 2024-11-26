/*Write a Java program that converts a given amount of money in
 U.S. dollars to another currency (e.g., rupees). Prompt the user to
 enter the amount and the exchange rate, and display the converted
 amount as a double */
 import java.util.Scanner;
public class Qno14 {
    public static void main(String[] args) {
        double exchangeRate,amount;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount and exchange rate :");
        amount=sc.nextDouble();
        exchangeRate=sc.nextDouble();
        
        double result=amount*exchangeRate;
        System.out.printf("The final rate is : %.2f", result);

        sc.close();
    }
}
