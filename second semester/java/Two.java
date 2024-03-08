import java.util.Scanner;
public class Two{
    public static void main(String[] args) {
        // Write a Java code to check whether a number is divisible by 5 and 11 or not.

        Scanner input =new Scanner(System.in);
         int numberOne ;
         
         System.out.print("Enter the First number");
            numberOne=input.nextInt();
         if (numberOne % 5==0 && numberOne % 11==0 ){
            System.out.println("The number is divisible by 5 and 11");

            input.close();
         }else {
            System.out.println("the number not divisible by 5 or 11 ");
         }
         input.close();
    }
}