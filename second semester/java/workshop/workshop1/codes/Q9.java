// Create a Java program that takes two integer inputs from the user, performs all basic arithmetic operations (addition, subtraction, multiplication, and division) on these numbers, and displays the results.

import java.util.Scanner;

public class Q9{
    public static void main(String[] args) {
     double addition, subtraction, multiplication ,division,number1,number2;

      Scanner input =new Scanner(System.in);
        System.out.println("Enter the  first number ");
        number1=input.nextDouble();
        System.out.println("Enter the  Second number ");
        number2=input.nextDouble();

        addition=number1+number2;
        multiplication=number1*number2;
        subtraction=number1-number2;
        division=number1/number2;

        System.out.println("The subtraction is :"+subtraction);
        System.out.println("The addition is : "+addition);
        System.out.println("The subtraction is "+multiplication);
        System.out.println("The divison is : "+division);
        

        input.close();


    }
}
