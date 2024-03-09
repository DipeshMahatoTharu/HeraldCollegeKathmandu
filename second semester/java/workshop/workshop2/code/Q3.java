// A college has following rules for grading system:
// a. 40 to 50 - C
// b. 50 to 60 - C+
// c. 60 to 70 - B
// d. 70 to 80 - B+
// e. 80 to 90 - A
// f. Above 90 - A+
// Ask user to enter marks and print the corresponding grade using if-else-if statement.


import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int Grades;

        System.out.print("Enter the Grade : ");
        Grades=input.nextInt();

        if(Grades > 40  && Grades <= 50 ){
            System.out.println("The "+Grades +" % in Grading System  is : C");
        }else if (Grades > 50 && Grades <= 60){
            System.out.println("The "+Grades +" % in Grading System  is : C+");
        }else if (Grades >60 &&  Grades <= 70){
            System.out.println("The "+Grades +" % in Grading System  is : B");
        }else if (Grades > 70 && Grades<=80 ){
            System.out.println("The "+Grades +" % in Grading System  is : B+");
        }else if (Grades>80 && Grades<=90){
            System.out.println("The "+Grades +" % in Grading System  is : A");
        }else if (Grades >90 && Grades<100){
            System.out.println("The "+Grades +" % in Grading System  is : A+");
        }else{
            System.out.println("The "+Grades +" % in Grading System  is : Fail");
        }
        input.close();
    }
}
