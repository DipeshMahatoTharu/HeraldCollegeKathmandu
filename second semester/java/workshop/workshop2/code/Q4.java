// Determine oldest and youngest among the people taking the user input.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age1, age2, age3;

        System.out.print("Enter the first age : ");
        age1 = input.nextInt();
        System.out.print("Enter the second age : ");
        age2 = input.nextInt();
        System.out.print("Enter the Third age : ");
        age3 = input.nextInt();

        // To find the oldest :
        if (age1 > age2 && age1 > age3) {
            System.out.println("Age1 is the oldest age :" + age1);
        } else if (age2 > age1 && age2 > age3) {
            System.out.println("Age2 is the oldest age :" + age2);
        } else if (age3 > age1 && age3 > age2) {
            System.out.println("Age3 is oldest age : " + age3);
        } else {
            System.out.println("All age are equal or invaild");
        }

        // to dint younger

        if (age1 < age3 && age2 < age3) {
            System.out.println("Age one is youngest ");

        } else if (age2 < age1 && age2 < age3) {
            System.out.println("Age 2 is the youngest one ");
        } else if (age3 < age1 && age3 < age2) {
            System.out.println("Age3 is youngest");
        } else {
            System.out.println("All are equal or invaild age");
        }

        input.close();
    }
}