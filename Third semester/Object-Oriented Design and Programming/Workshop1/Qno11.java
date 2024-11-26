/*  Develop a Java program that converts miles to kilometers. Prompt
 the user to enter the distance in miles and display the equivalent
 distance in kilometers as a double.*/
 import java.util.Scanner;
public class Qno11 {

    public static void main(String[] args) {
        // mile to kim =1.609344
        double mile,result,kilometers;
        kilometers=1.6;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the miles : ");
        mile=sc.nextDouble();

        result=mile*kilometers;

        System.out.println("The conversion is : "+result);

        sc.close();

    }
    
}
