import java.util.Scanner;


public class Q10 {
    //forula 2(l+b)
    public static void main(String[] args) {
        double Aera;
        int l, b;
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the  length ");
         l=input.nextInt();
         System.out.println("Enter the  breadth ");
         
         b=input.nextInt();

         Aera= 2*(l+b);
         System.out.println("The Area is :"+Aera);
         input.close();
    }


}
