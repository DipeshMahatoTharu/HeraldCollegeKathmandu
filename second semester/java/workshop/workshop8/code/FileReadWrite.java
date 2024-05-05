import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destinationFile = "output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
