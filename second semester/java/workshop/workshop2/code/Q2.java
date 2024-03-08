// Write a program to print the multiplication table of a number using user input.
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
         

        Scanner sc =new Scanner(System.in);
        
       int number, i ;
        System.out.print("Enter the multiplicaiton table  you want : ");
        number=sc.nextInt();

        for(i =1; i<=10 ;i++){
            System.out.println(number+ "*" + i +"=" + (number*i));
            
        }

        sc.close();
       
    }
 
}
