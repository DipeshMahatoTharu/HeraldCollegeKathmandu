package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(10, Calculator.add(5, 5));
    }
}
