import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    signUp(scanner);
                    break;
                case 2:
                    System.out.println("Thank you for using the Application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } while (choice != 2);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Please enter 1 for Sign up.");
        System.out.println("Please enter 2 for Quit.");
    }

    public static void signUp(Scanner scanner) {
        String fullName, mobileNumber, password, confirmPassword, dob;

        boolean isValidInput;
        do {
            System.out.println("Please enter your full name:");
            fullName = scanner.nextLine();

            System.out.println("Please enter your mobile number:");
            mobileNumber = scanner.nextLine();

            System.out.println("Please enter your password:");
            password = scanner.nextLine();

            System.out.println("Please confirm your password:");
            confirmPassword = scanner.nextLine();

            System.out.println("Please enter your Date of Birth (DD/MM/YYYY):");
            dob = scanner.nextLine();

            isValidInput = isValidFullName(fullName) &&
                           isValidMobileNumber(mobileNumber) &&
                           isValidPassword(password) &&
                           password.equals(confirmPassword) &&
                           isValidDateOfBirth(dob);

            if (!isValidInput) {
                System.out.println("Invalid input. Please start again.");
            }
        } while (!isValidInput);

        System.out.println("You have successfully signed up.");
    }


    public static boolean isValidFullName(String fullName) {
        return fullName.length() > 4;
    }

    public static boolean isValidMobileNumber(String mobileNumber) {
        return mobileNumber.matches("0\\d{9}");
    }

    public static boolean isValidPassword(String password) {
        return password.matches("[a-zA-Z]+[@&]\\d+");
    }

    public static boolean isValidDateOfBirth(String dob) {
        String[] dobParts = dob.split("/");
        if (dobParts.length != 3) {
            return false;
        }
        int day = Integer.parseInt(dobParts[0]);
        int month = Integer.parseInt(dobParts[1]);
        int year = Integer.parseInt(dobParts[2]);
        return (day >= 1 && day <= 31) && (month >= 1 && month <= 12) && (year >= 1900 && year <= 2023);
    }
}