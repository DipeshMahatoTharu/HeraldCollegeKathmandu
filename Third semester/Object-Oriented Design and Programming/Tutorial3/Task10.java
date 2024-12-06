import java.io.File;

public class Task10 {
    public static void main(String[] args) {
        File file = new File("myFile.txt");
        if (file.delete()) {
            System.out.println("File deleted ");
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
