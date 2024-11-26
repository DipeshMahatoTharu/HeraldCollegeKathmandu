/* Write a Java program that calculates the simple interest on a loan.
 Prompt the user to enter the principal amount, the rate of interest,
 and the time period. 
 Calculate and display the interest amount as a
 double */
import java.util.Scanner;
public class Qno8 {

    public static void main(String[] args) {
        double principal,rate;
        float time;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the principle :");
        principal=sc.nextDouble();
        System.out.print("Enter the interst :");
        rate=sc.nextDouble();
        System.out.print("Enter the time :");
        time=sc.nextFloat();

        double simpleIntrest=(principal*time*rate)/100 ;
        System.out.printf("SI: %.2f",simpleIntrest);



        sc.close();
        


        
    }
}
