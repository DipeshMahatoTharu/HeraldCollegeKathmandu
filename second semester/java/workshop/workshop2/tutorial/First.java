public class First{
    public static void main(String [] args){
        // Write a Java code to declare a variable number1 and  number2 and 
        // initialize an integer variable with the value 15 and 10 respectively add them check whether the sum is greater than 20 or not.
        int firstNumber, SecondNumber, Sum;

        firstNumber=15;
        SecondNumber=10;
        Sum=firstNumber+SecondNumber;

        if (Sum > 20){
            System.out.println("The number is greater then the 20 ");
        }
            else {
                System.out.print("The number is less then 20 ");
            }
    }
}