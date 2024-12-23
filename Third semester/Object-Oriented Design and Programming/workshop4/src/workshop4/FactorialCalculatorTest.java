package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class FactorialCalculatorTest {

    @Test
    public void testFactorial() {
        assertEquals(1, FactorialCalculator.factorial(0));
        assertEquals(1, FactorialCalculator.factorial(1));
        assertEquals(120, FactorialCalculator.factorial(5));
        assertEquals(3628800, FactorialCalculator.factorial(10));
        assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));

     
}
}
