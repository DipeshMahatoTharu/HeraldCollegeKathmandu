//Write a Java program to find the sequence of one upper case letter followed by lower case letters. z
public class Ques16 {
    public static void main(String[] args) {
        String input = "HelloWorld";
        findUppercaseLowercaseSequence(input);
    }

    public static void findUppercaseLowercaseSequence(String input) {
        boolean found = false;

        for (int i = 0; i < input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);

            if (Character.isUpperCase(currentChar) && Character.isLowerCase(nextChar)) {
                System.out.println("Sequence found: " + currentChar + nextChar);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No sequence of one uppercase letter followed by lowercase letters found.");
        }
    }
}

