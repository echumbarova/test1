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
    assertEquals("Incorrect results for empty array.", "Nan", baos.toString().trim());
  }

  @Test
  public void twoElementsTest() {
    Scanner scanner = new Scanner("2\n1 2\n");
    scanner.useDelimiter(System.lineSeparator() + "|\\s");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(baos);
    problem.runFromInput(scanner, true, out);
    assertEquals("Incorrect result for array [1, 2].", "1", baos.toString().trim());
  }

  @Test
  public void threeElementsTest() {
    Scanner scanner = new Scanner("3\n1 3 2\n");
    scanner.useDelimiter(System.lineSeparator() + "|\\s");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(baos);
    problem.runFromInput(scanner, true, out);
    assertEquals("Incorrect result for array [1, 3, 2].", "2", baos.toString().trim());
  }
  
  @Test
  public void fourElementsTest() {
    Scanner scanner = new Scanner("4\n1 2 3 4\n");
    scanner.useDelimiter(System.lineSeparator() + "|\\s");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(baos);
    problem.runFromInput(scanner, true, out);
    assertEquals("Incorrect result for array [1, 2, 3, 4].", "3", baos.toString().trim());
  }

  @Test
  public void sameElementsTest() {
    Scanner scanner = new Scanner("3\n10 10 10\n");
    scanner.useDelimiter(System.lineSeparator() + "|\\s");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(baos);
    problem.runFromInput(scanner, true, out);
    assertEquals("Incorrect result for array [10, 10, 10].", "10", 
        baos.toString().trim());
  }
  
  @Test
  public void negativeElementsTest() {
    Scanner scanner = new Scanner("4\n-2 10 -2 -2\n");
    scanner.useDelimiter(System.lineSeparator() + "|\\s");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(baos);
    problem.runFromInput(scanner, true, out);
    assertEquals("Incorrect result for array [-2 10 -2 -2].", "-2", 
        baos.toString().trim());
  }
  
  @Test
  public void reverseSortedTest() {
    Scanner scanner = new Scanner("5\n60 10 -2 -4 -6 -1001\n");
    scanner.useDelimiter(System.lineSeparator() + "|\\s");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(baos);
    problem.runFromInput(scanner, true, out);
    assertEquals("Incorrect result for array [60 10 -2 -4 -6 -1001].", "10", 
        baos.toString().trim());
  }

}
