// Write a program to print the difference and product of numbers 45 and 32. without prompt
import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1=45;
        int number2=32;
    
        int different=number1=number2;
        int product=number1*number2;

        System.out.println("the different is : " +different);
        System.out.println("the product is : " +product);

        input.close();



    }
}