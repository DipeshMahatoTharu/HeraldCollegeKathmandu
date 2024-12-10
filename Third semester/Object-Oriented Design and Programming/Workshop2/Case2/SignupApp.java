package Case2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String fullName;
    private String mobileNumber;
    private String password;
    private String dateOfBirth;

    public User(String fullName, String mobileNumber, String password, String dateOfBirth) {
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}

public class SignupApp {
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nPlease enter 1 for Sign up.");
            System.out.println("Please enter 2 for Quit.");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                signUp();
            } else if (choice == 2) {
                System.out.println("Application closed.");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void signUp() {
        String fullName, mobileNumber, password, confirmPassword, dob;

        // Full name validation
        while (true) {
            System.out.print("Please enter your full name: ");
            fullName = scanner.nextLine();
            if (fullName.length() > 4) break;
            System.out.println("Full name must be greater than four characters. Please try again.");
        }

        // Mobile number validation
        while (true) {
            System.out.print("Please enter your mobile number (username): ");
            mobileNumber = scanner.nextLine().trim();
            if (mobileNumber.matches("^\\+977\\d{10}$")) {
                break;
            }
            System.out.println("Mobile number must have 10 digits and start with +977. Please try again.");
        }

        // Password validation
        while (true) {
            System.out.print("Please enter your password: ");
            password = scanner.nextLine();
            if (password.matches("^[A-Z](?=.*[@&])(?=.*\\d).+$")) break;
            System.out.println("Password must start with a capital letter, contain @ or &, and include a number. Please try again.");
        }

        // Password confirmation
        while (true) {
            System.out.print("Please confirm your password: ");
            confirmPassword = scanner.nextLine();
            if (password.equals(confirmPassword)) break;
            System.out.println("Passwords do not match. Please try again.");
        }

        // Date of birth validation
        while (true) {
            System.out.print("Please enter your Date of Birth #DD/MM/YYYY (No space): ");
            dob = scanner.nextLine();
            if (validateDOB(dob)) break;
            System.out.println("Invalid Date of Birth format or user is not at least 21 years old. Please try again.");
        }

        // Saving the user data
        User newUser = new User(fullName, mobileNumber, password, dob);
        users.add(newUser);
        System.out.println("You have successfully signed up.");
    }

    private static boolean validateDOB(String dob) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate birthDate = LocalDate.parse(dob, formatter);
            LocalDate today = LocalDate.now();
            int age = today.getYear() - birthDate.getYear();
            if (birthDate.plusYears(age).isAfter(today)) {
                age--;
            }
            return age >= 21;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
