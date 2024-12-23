package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	  @Test
	    void testEvenNumbers() {
	        int[] input = {1, 2, 3, 4, 5, 6};
	        List<Integer> expectedOutput = Arrays.asList(2, 4, 6); 

	        List<Integer> actualOutput = NumberUtils.getEvenNumbers(input);
	        assertEquals(expectedOutput, actualOutput);
	    }

}
