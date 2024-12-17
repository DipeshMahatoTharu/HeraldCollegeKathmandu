package workshop4;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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

    @Test
    void testValidEmail() {
        Service service = new Service();
        assertTrue(service.sendEmail("example@test.com", "Hello, this is a test message!"));
    }

    @Test
    void testInvalidEmail() {
        Service service = new Service();
        assertFalse(service.sendEmail("invalid-email", "This should fail."));
    }

    @Test
    void testEmptyEmail() {
        Service service = new Service();
        assertFalse(service.sendEmail("", "This should fail too."));
    }
}
