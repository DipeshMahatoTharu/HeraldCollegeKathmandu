/*
 Create a Java program that computes the area of a circle. Prompt
 the user to enter the radius and display the result as a double. Use
 the formula (Area = π * r * r) for the calculation
 */
import java.util.Scanner;
public class Qno12 {
    public static void main(String[] args) {
        double radius,result;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the radius :");
        radius=sc.nextDouble();

        result=Math.PI*radius*radius;
        System.out.print("The reuslt is :"+result);


        sc.close();
    }
}
