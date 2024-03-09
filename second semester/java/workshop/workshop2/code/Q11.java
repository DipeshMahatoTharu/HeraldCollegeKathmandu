// Write a program to sum first n even numbers using a while loop.

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, count=0 ,sum=0, num =2;
        System.out.print("Enter the  value n :");
        n=input.nextInt();


        while(count< n){
           
         sum=sum+num;// Add the current even number to the sum
         num=num+2;// adding +2 in num

         count ++;// Increment the counter
           
        }
            System.out.println(" sum of first "+n+" even numbers : "+sum );



        input.close();
    }
}
