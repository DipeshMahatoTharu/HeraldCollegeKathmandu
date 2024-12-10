/*Create a class Student with private fields name, age, grade(A, B, C, D, E, F).
Then, write a program that stores student information(id, name, age, grade) into
a .csv file*/
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Studentt {
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Studentt(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }
}



		

public class Q8 {
		   public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Specify the CSV file name
		        String fileName = "students.csv";

		        try (FileWriter fileWriter = new FileWriter(fileName)) {
		            // Write CSV header
		            fileWriter.write("ID,Name,Age,Grade\n");

		            System.out.println("Enter student details (type 'exit' as ID to stop):");

		            int id = 1; // Start with student ID 1
		            while (true) {
		                System.out.print("Enter Student ID: ");
		                String studentId = scanner.nextLine();

		                if (studentId.equalsIgnoreCase("exit")) {
		                    break;
		                }

		                System.out.print("Enter Student Name: ");
		                String name = scanner.nextLine();

		                System.out.print("Enter Student Age: ");
		                int age = scanner.nextInt();
		                scanner.nextLine(); // Consume newline character

		                System.out.print("Enter Student Grade (A, B, C, D, E, F): ");
		                String grade = scanner.nextLine();

		                // Create a Student object
		                Studentt student = new Studentt(name, age, grade);

		                // Write student details to the CSV file
		                fileWriter.write(id + "," + student.getName() + "," + student.getAge() + "," + student.getGrade() + "\n");

		                id++;
		                System.out.println("Student details saved.\n");
		            }

		            System.out.println("All student details have been saved to " + fileName);
		        } catch (IOException e) {
		            System.out.println("An error occurred while writing to the file.");
		            e.printStackTrace();
		        } finally {
		            scanner.close();
		        }
		    }
		

	}
