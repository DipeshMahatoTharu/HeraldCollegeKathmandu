package workshop4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculateAllTest {

	private CalculatorAll calculator;

    @BeforeAll
    static void setUpBeforeClass() {
        System.out.println("Starting Calculator Tests");
    }

    @AfterAll
    static void tearDownAfterClass() {
        System.out.println("All Calculator Tests Completed");
    }

    @BeforeEach
    void setUp() {
        calculator = new CalculatorAll();
        System.out.println("Initializing Calculator for Test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test Completed\n");
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(4, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(6, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

}
