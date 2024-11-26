/*Develop a Java program that calculates the total cost of
 purchasing a given quantity of items at a certain price per item.
 Prompt the user to enter the quantity and price, and display the total
 cost as a double. */
import java.util.Scanner;
public class Qno13 {
    public static void main(String[] args) {
        double quantity,price,totalCost;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter quantiy and price :");
        quantity=sc.nextDouble();
        price=sc.nextDouble();

        totalCost=quantity*price;

        System.out.print("The totalcose is :"+totalCost);
        


        sc.close();
    }
}
