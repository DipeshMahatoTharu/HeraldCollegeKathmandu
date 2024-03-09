// Write a program to check whether the number is odd or even using switch statement.

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter the number : ");
        number = input.nextInt();
        // check if Number %2 is 0 or 1 if its 0 its even orlese its odd
        switch (number % 2) {
            case 0:
                System.out.println("Number is even");
                break;
            case 1:
                System.out.println("Number is odd");
                break;

        }

        input.close();
    }
}
