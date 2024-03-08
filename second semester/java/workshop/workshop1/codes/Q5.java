// Write a Java program to calculate the area of a square. Prompt the user to enter the length of one side and then display the result. Ensure that the program handles user input as a double data type.
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int length;

        Scanner input =new Scanner(System.in);
        System.out.println("Enter the length ");

        length=input.nextInt();

        int AeraOfSqure=length*length;

        System.out.println("The aera is of squre is : "+AeraOfSqure);
        input.close();
    }
}
