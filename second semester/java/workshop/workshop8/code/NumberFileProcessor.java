import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NumberFileProcessor {

    public static void main(String[] args) {
        NumberFileProcessor processor = new NumberFileProcessor();
        String inputFilePath = "numbers.txt";
        String oddFilePath = "odd.txt";
        String evenFilePath = "even.txt";

        List<Integer> numbers = processor.read(inputFilePath);
        List<Integer> evenNumbers = processor.getEven(numbers);
        List<Integer> oddNumbers = processor.getOdd(numbers);

        processor.write(evenNumbers, evenFilePath);
        processor.write(oddNumbers, oddFilePath);

        System.out.println("Odd numbers have been written to odd.txt");
        System.out.println("Even numbers have been written to even.txt");
    }

    public List<Integer> getEven(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public List<Integer> getOdd(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public void write(List<Integer> numbers, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int number : numbers) {
                writer.write(Integer.toString(number));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public List<Integer> read(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    try {
                        int number = Integer.parseInt(token);
                        numbers.add(number);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid number format: " + token);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return numbers;
    }
}
