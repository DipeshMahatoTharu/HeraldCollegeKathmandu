// Write a program to calculate the area of a triangle.
// Where s is the semi-perimeter of the triangle s = (a+b+c)/2
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double a ,b,c ,s , Aera;
        System.out.println("Enter the a ");
        a=input.nextInt();

        System.out.println("Enter the b ");
        b=input.nextInt();

        System.out.println("Enter the c ");
        c=input.nextInt();
// calculate the semi-perimeter
         s= (a+b+c)/2;

// calculate the aera
        Aera=Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The aera of trianle is : " +Aera);
        input.close();

    }

}
