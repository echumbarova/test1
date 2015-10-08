package simple;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

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
  public void tearDown() throws Exception {}

  @Test
  public void zeroTest() {
    Scanner scanner = new Scanner("0\n");
    scanner.useDelimiter(System.lineSeparator() + "|\\s");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(baos);
    problem.runFromInput(scanner, true, out);
    assertEquals("Incorrect results for 0.", "Nan", baos.toString().trim());
  }
  
  @Test
  public void primeTest() {
    Scanner scanner = new Scanner("17\n");
    scanner.useDelimiter(System.lineSeparator() + "|\\s");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(baos);
    problem.runFromInput(scanner, true, out);
    assertEquals("Incorrect results for 17.", "[17]", baos.toString().trim());
  }
  
  @Test
  public void negativeTest() {
    Scanner scanner = new Scanner("-268\n");
    scanner.useDelimiter(System.lineSeparator() + "|\\s");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(baos);
    problem.runFromInput(scanner, true, out);
    assertEquals("Incorrect results for -258.", "Nan", baos.toString().trim());
  }
  
  @Test
  public void smallNumberTest() {
    Scanner scanner = new Scanner("6\n");
    scanner.useDelimiter(System.lineSeparator() + "|\\s");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(baos);
    problem.runFromInput(scanner, true, out);
    assertEquals("Incorrect results for 6.", 
    		"[2, 3]", baos.toString().trim());
  }
  
  @Test
  public void bigNumberTest() {
    Scanner scanner = new Scanner("5057976\n");
    scanner.useDelimiter(System.lineSeparator() + "|\\s");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(baos);
    problem.runFromInput(scanner, true, out);
    assertEquals("Incorrect results for 5057976.", 
    		"[2, 2, 2, 3, 7, 7, 11, 17, 23]", baos.toString().trim());
  }

}
