
//Write a program to check the odd and even numbers using user input.
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int odd, even, num;
        System.out.print("Enter the number");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is odd");
        }

    }
}
