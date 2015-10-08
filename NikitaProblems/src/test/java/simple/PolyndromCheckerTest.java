package simple;

import static org.junit.Assert.assertEquals;
import main.Problem;

import org.junit.Before;
import org.junit.Test;

public class PolyndromCheckerTest {
	Problem problem;

	@Before
	public void setUp() throws Exception {
		problem = new PrimeDecomposition();
	}

	@Test
	public void zeroTest() {
		assertEquals("Incorrect results for empty string.", "Nan",
				problem.run(""));
	}
	
	@Test
	public void singleLetterTest() {
		assertEquals("Incorrect results for 'a'.", "true",
				problem.run("a"));
	}
	
	@Test
	public void twoLetterTest() {
		assertEquals("Incorrect results for 'bb'.", "true",
				problem.run("bb"));
	}
	
	@Test
	public void twoLetterFalseTest() {
		assertEquals("Incorrect results for 'bc'.", "false",
				problem.run("bc"));
	}
	
	@Test
	public void evenLetterTest() {
		assertEquals("Incorrect results for 'abbchhcbba'.", "true",
				problem.run("abbchhcbba"));
	}
	
	@Test
	public void evenLetterFalseTest() {
		assertEquals("Incorrect results for 'abtchhcbba'.", "false",
				problem.run("abtchhcbba"));
	}
	
	@Test
	public void oddLetterTest() {
		assertEquals("Incorrect results for 'hhhhhhaaaacaaaahhhhhh'.", "true",
				problem.run("hhhhhhaaaacaaaahhhhhh"));
	}
}
