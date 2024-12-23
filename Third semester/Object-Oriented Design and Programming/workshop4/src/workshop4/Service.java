package workshop4;
import java.util.regex.Pattern;


public class Service {

    public boolean sendEmail(String email, String message) {
        if (isValidEmail(email)) {
            System.out.println("Email sent to: " + email);
            System.out.println("Message: " + message);
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[\\w-\\.+]*[\\w-\\.]\\@[\\w]+([\\.][\\w]+)+$";
        return Pattern.matches(emailRegex, email);
    }

}
