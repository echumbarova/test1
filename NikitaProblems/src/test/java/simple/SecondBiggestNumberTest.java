package simple;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class SecondBiggestNumberTest {

	SecondBiggestNumber problem;
	
	@Before
	public void setUp() throws Exception {
		problem = new SecondBiggestNumber();
	}
	
	@Test
    public void nullTest() {
        Scanner scanner = new Scanner("0\n");
        scanner.useDelimiter(System.lineSeparator() + "|\\s");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        problem.runFromInput(scanner, true, out);
        assertEquals("Nan", baos.toString(), 
            "Incorrect results for empty array.");
    }
	
	@Test
	public void twoElementsTest() {
		Scanner scanner = new Scanner("2\n1 2\n");
		scanner.useDelimiter(System.lineSeparator() + "|\\s");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(baos);
		problem.runFromInput(scanner, true, out);
		assertEquals("1", baos.toString(),
		    "Incorrect result for array [1, 2].");
	}
	
	@Test
    public void threeElementsTest() {
        Scanner scanner = new Scanner("3\n1 3 2\n");
        scanner.useDelimiter(System.lineSeparator() + "|\\s");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        problem.runFromInput(scanner, true, out);
        assertEquals("2", baos.toString(),
            "Incorrect result for array [1, 2, 3].");
    }
    
	@Test
    public void sameElementsTest() {
        Scanner scanner = new Scanner("3\n10 10 10\n");
        scanner.useDelimiter(System.lineSeparator() + "|\\s");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        problem.runFromInput(scanner, true, out);
        assertEquals("10", baos.toString(),
            "Incorrect result for array [10, 10, 10].");
    }
    
}
