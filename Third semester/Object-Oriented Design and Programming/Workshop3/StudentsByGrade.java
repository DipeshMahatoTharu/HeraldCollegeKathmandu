import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Students1 {
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Students1(String name, int age, String grade) {
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

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class StudentsByGrade {
    public static void main(String[] args) {
        String fileName = "students.csv"; // File to store student data

        // Step 1: Create the CSV file with sample data
        createCSVFile(fileName);

        // Step 2: Read the CSV file and store data in a list
        List<Students1> students1 = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Skip the header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) { // Ensure there are three fields: name, age, grade
                    String name = data[0];
                    int age = Integer.parseInt(data[1].trim());
                    String grade = data[2].trim();
                    students1.add(new Students1(name, age, grade));
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
            return;
        }

        // Step 3: Group students by grade
        Map<String, List<Students1>> studentsByGrade = new HashMap<>();
        for (Students1 student : students1) {
            studentsByGrade
                    .computeIfAbsent(student.getGrade(), k -> new ArrayList<>())
                    .add(student);
        }

        // Step 4: Display students grouped by grade
        System.out.println("Students grouped by grade:");
        for (Map.Entry<String, List<Students1>> entry : studentsByGrade.entrySet()) {
            String grade = entry.getKey();
            List<Students1> studentsInGrade = entry.getValue();

            System.out.println("Grade " + grade + ":");
            for (Students1 student : studentsInGrade) {
                System.out.println("  " + student);
            }
        }
    }

    // Function to create a CSV file with sample student data
    private static void createCSVFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Name,Age,Grade"); // Header
            writer.println("Dipesh,14,A");
            writer.println("Roshan,15,B");
           
            System.out.println("CSV file created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}