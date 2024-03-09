// Ask student if he/she has medical cause or not ( 'y or 'n' ). 
//if (‘y’)  print you are not allowed to sit in the exam  and if(‘n’’) print you can sit in the exam.

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
       char medical;
        System.out.print(" Do you have a medical cause? (Enter 'y' for yes or 'n' for no): ");
         medical =input.next().charAt(0);

        if( medical == 'y'){
            System.out.println("You are not allowed to sit in exam");
        }else if(medical == 'n') {
            System.out.println("You can sit in the exam ");
        }else{
            System.out.println("invaild choice");
        }
        
    }
    
}
