// Write a program to check  the number is odd or even, 
// if the number is even, check whether it is divisible by 4, 
// and if the number is odd,check whether it is divisible by 7 or not using user input.

import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num ;
        System.out.print("Enter the Number to check odd or even ");
        num =input.nextInt();
        
        if(num % 2==0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
                if(num % 7==0){
                    System.out.println("The odd number is divisible by 7");
                }else {
                    System.out.println(" But  "+num +"  is not divisible  by 7 ");

        
                }
        }
        input.close();

    }
}
