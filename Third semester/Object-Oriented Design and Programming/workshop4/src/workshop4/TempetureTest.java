package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempetureTest {

	@Test
	void test() {
		assertEquals(32,Tempeture.CelsicToFar(0));
		assertEquals(0,Tempeture.Fartocel(11));
	}

}
