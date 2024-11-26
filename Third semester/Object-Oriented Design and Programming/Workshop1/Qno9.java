/* Create a Java program that takes two integer inputs from the user,
 performs all basic arithmetic operations (addition, subtraction,
 multiplication, and division) on these numbers, and displays the
 results.
*/

import java.util.Scanner;

public class Qno9 {
    public static void main(String[] args) {
        int num1,num2,mul,sub,add,div;

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter num1 and num2 :" );
        num1 =sc.nextInt();
        num2 =sc.nextInt();
        add=num1+num2;
        sub=num1-num2;

        mul=num1*num2;
        div=num1/num2;

        System.out.printf("The add is :%d\n The div is :%d\n The mul is :%d\n The sub is :%d",add,div,mul,sub);
        sc.close();
    }
    
}
