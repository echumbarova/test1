package advanced;

import static org.junit.Assert.assertEquals;
import main.Problem;

import org.junit.Before;
import org.junit.Test;

public class RunLengthDecodingTest {
	Problem problem;

	@Before
	public void setUp() throws Exception {
		problem = new RunLengthDecoding();
	}

	@Test
	public void zeroTest() {
		assertEquals("Incorrect results for empty string.", "Nan",
				problem.run(""));
	}
	
	@Test
	public void singleLetterTest() {
		assertEquals("Incorrect results for 'a'.", "This is polindrome.",
				problem.run("a"));
	}
	
	@Test
	public void twoLetterTest() {
		assertEquals("Incorrect results for 'bb'.", "This is polindrome.",
				problem.run("bb"));
	}
	
	@Test
	public void twoLetterFalseTest() {
		assertEquals("Incorrect results for 'bc'.", "This is not polindrome.",
				problem.run("bc"));
	}
	
	@Test
	public void evenLetterTest() {
		assertEquals("Incorrect results for 'abbchhcbba'.", "This is polindrome.",
				problem.run("abbchhcbba"));
	}
	
	@Test
	public void evenLetterFalseTest() {
		assertEquals("Incorrect results for 'abtchhcbba'.", "This is not polindrome.",
				problem.run("abtchhcbba"));
	}
	
	@Test
	public void oddLetterTest() {
		assertEquals("Incorrect results for 'hhhhhhaaaacaaaahhhhhh'.", "This is polindrome.",
				problem.run("hhhhhhaaaacaaaahhhhhh"));
	}
}
