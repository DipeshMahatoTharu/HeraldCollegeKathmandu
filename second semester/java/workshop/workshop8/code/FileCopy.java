import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "one.txt";
        String destinationFile = "two.txt";

        try {
            // Create BufferedInputStream to read from the source file
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));
            
            // Create BufferedOutputStream to write to the destination file
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destinationFile));

            // Read bytes from the source file and write them to the destination file
            int bytesRead;
            byte[] buffer = new byte[1024];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            // Close streams
            inputStream.close();
            outputStream.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
