package workshop4;

public class FactorialCalculator {

    public static long factorial(int n) {
        if (n < 0) {
           System.out.println("Enter value more then 0");
        }
        
        long result = 1;
        
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
}

