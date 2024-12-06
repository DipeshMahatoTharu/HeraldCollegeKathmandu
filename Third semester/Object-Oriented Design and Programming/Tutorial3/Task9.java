import java.io.FileWriter;
import java.io.IOException;

public class Task9{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myFile.txt", true);
            writer.append("\nMy name is Dipesh");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
