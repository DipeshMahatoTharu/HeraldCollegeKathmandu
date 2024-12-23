package workshop4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeNumberCheckTest {

 
    @Test
    public void testIsPrime() {
       
        assertTrue(PrimeNumberCheck.isPrime(2), "2 should be prime");
        assertTrue(PrimeNumberCheck.isPrime(3), "3 should be prime");
        assertTrue(PrimeNumberCheck.isPrime(5), "5 should be prime");
        assertTrue(PrimeNumberCheck.isPrime(29), "29 should be prime");

    }
}