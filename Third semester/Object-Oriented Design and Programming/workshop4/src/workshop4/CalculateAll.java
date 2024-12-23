package workshop4;


class CalculatorAll {
    public int add(int a, int b) { 
    	return a + b;
    	}
    public int subtract(int a, int b)
    { return a - b; 
    }
    public int multiply(int a, int b) {
    	return a * b; 
    	}
    public double divide(int a, int b) {
        if (b == 0) 
        throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;
    }
}