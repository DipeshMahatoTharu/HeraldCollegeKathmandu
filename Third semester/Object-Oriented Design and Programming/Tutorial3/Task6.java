import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String email = "dipesh@gmail.com";
        String password = "StrongPass123@@";

        boolean isEmailValid = validateEmail(email);
        boolean isPasswordValid = validatePassword(password);

        System.out.println("Email is valid: " + isEmailValid);
        System.out.println("Password is valid: " + isPasswordValid);
    }

    public static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(emailRegex, email);
    }

    public static boolean validatePassword(String password) {
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return Pattern.matches(passwordRegex, password);
    }
}
