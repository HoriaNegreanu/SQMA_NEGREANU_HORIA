import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UtilTests {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testSumCorrect() {
		int result = UtilFunctions.Sum(2, 3);
		assertEquals(result, 5);
		
	}
	
	@Test
	public void testSumException() {
		assertThrows(IllegalArgumentException.class, () -> UtilFunctions.Sum(-2, 101));
	}
	
	@Test
	public void testArrayProductCorrect() {
		int result = UtilFunctions.ArrayProduct(new ArrayList<>(Arrays.asList(5, 6, 2)));
		assertEquals(result, 60);
	}

}
