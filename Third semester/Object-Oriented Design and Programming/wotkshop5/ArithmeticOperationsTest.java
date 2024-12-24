package wotkshop5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArithmeticOperationsTest {
    ArithmeticOperations operations = new ArithmeticOperations();

    @Test
    public void testAdd() {
        assertEquals(15, operations.add(10, 5), "Addition test failed");
    }

    @Test
    public void testSubtract() {
        assertEquals(5, operations.subtract(10, 5), "Subtraction test failed");
    }

    @Test
    public void testMultiply() {
        assertEquals(50, operations.multiply(10, 5), "Multiplication test failed");
    }
}
