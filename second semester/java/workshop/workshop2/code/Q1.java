// Taking length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int length ,breadth ;
        System.out.print("Enter the Length : ");
        length =input.nextInt();
        System.out.print("Enter the Breadth: ");
        breadth=input.nextInt();

        if(length== breadth){
            System.out.print("This is squre because length and breeadth are equal");

        }else{
            System.out.println("The length and breath are not equal so it is not squal");
        }
        input.close();
    }
}