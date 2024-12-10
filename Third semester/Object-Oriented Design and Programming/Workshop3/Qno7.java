/*Write a program to take the name of foods as inputs from the user and store
them in a .txt file.*/ 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Qno7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (FileWriter fileWriter = new FileWriter("foods.txt")) {
            System.out.println("Enter the names of foods (type 'exit' to stop):");

            while (true) {
                String food = scanner.nextLine();
                if (food.equalsIgnoreCase("exit")) {
                    break;
                }
                fileWriter.write(food + "\n");
            }

            System.out.println("Food names saved to foods.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
        scanner.close();
    }
}