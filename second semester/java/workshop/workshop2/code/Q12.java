// Write a program to find the factorial of a given  number using for loops.
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, i;

        System.out.print("Enter the number: ");
        number = input.nextInt();
        long factorial = 1L;

        for (i = 1; i <= number; i++) {
            factorial =factorial* i;
        }

        System.out.println("The Factorial of " + number + " is " + factorial);

        input.close();
    }
}

