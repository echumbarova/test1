package simple;

import static org.junit.Assert.*;

import main.Problem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrimeDecompositionTest {

	Problem problem;

	@Before
	public void setUp() throws Exception {
		problem = new PrimeDecomposition();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void zeroTest() {
		
		assertEquals("Incorrect results for 0.", "Nan", 
				problem.run("0"));
	}

	@Test
	public void primeTest() {
		assertEquals("Incorrect results for 17.", 
				"[17]", problem.run("17"));
	}

	@Test
	public void negativeTest() {
		assertEquals("Incorrect results for -258.", 
				"Nan", problem.run("-258"));
	}

	@Test
	public void smallNumberTest() {
		assertEquals("Incorrect results for 6.", 
				"[2, 3]", problem.run("6"));
	}

	@Test
	public void bigNumberTest() {
		assertEquals("Incorrect results for 5057976.",
				"[2, 2, 2, 3, 7, 7, 11, 17, 23]", problem.run("5057976"));
	}

}
