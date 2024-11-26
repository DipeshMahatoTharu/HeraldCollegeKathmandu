
// Addition of Two number: Write a program to add two numbers using a class and a method.
import java.util.Scanner;

class Addition{
   public int Add(int a ,int b){
    return a+b;

    }
}
public class Task11 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int Num1=sc.nextInt();
        System.out.println("Enter the first Number:");
        int Num2=sc.nextInt();

        Addition addition =new Addition();
        int output=addition.Add(Num1,Num2);
        System.out.println("The Two Addition are :" +output);
    
        sc.close();       
    }
}