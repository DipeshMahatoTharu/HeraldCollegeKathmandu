import java.io.FileWriter;
import java.io.IOException;

public class Task7{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myFile.txt");
            writer.write("aslmdlasmdklmsadlkasmd");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
