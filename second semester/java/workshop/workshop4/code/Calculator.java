public class Calculator {
    public int add(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public double add(double... numbers) {
        double total = 0.0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(5, 8);
        System.out.println(result1);

        int result2 = calculator.add(10, 15, 20);
        System.out.println(result2);

        double result3 = calculator.add(3.5, 2.7);
        System.out.println(result3);

        double result4 = calculator.add(1.1, 2.2, 3.3);
        System.out.println(result4);
    }
}