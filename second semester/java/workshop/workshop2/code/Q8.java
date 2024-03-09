//Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. 
//Calculate percentage and grade according to following:
// Percentage >= 90% : Grade A
// Percentage >= 80% : Grade B
// Percentage >= 70% : Grade C
// Percentage >= 60% : Grade D
// Percentage >= 40% : Grade E
// Percentage < 40% : Grade F

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Physics, Chemistry, Biology, Mathematics, Computer, Total, Percentage;

        System.out.print("Enter the Marks of Physics : ");
        Physics = input.nextDouble();
        System.out.print("Enter the Marks of Chemistry : ");
        Chemistry = input.nextDouble();
        System.out.print("Enter the Marks of Biology : ");
        Biology = input.nextDouble();
        System.out.print("Enter the Marks of Mathematics : ");
        Mathematics = input.nextDouble();
        System.out.print("Enter the Marks of Computer : ");
        Computer = input.nextDouble();

        Total = Physics + Chemistry + Biology + Mathematics + Computer;
        Percentage = (Total / (5 * 100) * 100);


            
        if(Percentage > 100 && Percentage <= 90){
            System.out.println("Total percentage is : "+Percentage );
            System.out.println("Grade A ");
        }else if (Percentage >=  80 ){
            System.out.println("Total percentage is : "+Percentage );
            System.out.println("Grade B");
        }else if (Percentage >= 70){
            System.out.println("Total percentage is : "+Percentage );
            System.out.println("Grade C ");
        }else if (Percentage >= 60){
            System.out.println("Total percentage is : "+Percentage );
            System.out.println("Grade D");
        }else if (Percentage >=50){
            System.out.println("Total percentage is : "+Percentage );
            System.out.println("Grade E");
        }else if (Percentage >= 40){
            System.out.println("Total percentage is : "+Percentage );
            System.out.println("Grade F");
        }else{
            System.out.println("Your percentage is below 40  \n Your Percentage is : "+Percentage);
        }

        input.close();
    }
}
