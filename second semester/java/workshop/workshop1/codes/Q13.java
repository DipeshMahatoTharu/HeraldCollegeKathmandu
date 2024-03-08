// Develop a Java program that calculates the total cost of purchasing a given quantity of items at a certain price per item.
//  Prompt the user to enter the quantity and price, and display the total cost as a double.

import java.util.Scanner;
public class Q13{
    public static void main(String[] args) {
        int quantity;
        double totalCost, price;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the quantity: ");
        quantity=input.nextInt();
        System.out.print("Enter the price: ");
        price=input.nextDouble();

        totalCost=quantity*price;

        System.out.println("The total cost is : "+totalCost);
        
        input.close();
    }

}