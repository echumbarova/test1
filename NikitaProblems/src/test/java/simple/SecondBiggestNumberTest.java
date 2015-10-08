package simple;

import static org.junit.Assert.assertEquals;

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
    assertEquals("Incorrect results for empty array.", 
    		"Nan", problem.run("0"));
  }

  @Test
  public void twoElementsTest() {
    assertEquals("Incorrect result for array [1, 2].", "1", 
    		problem.run("2\n1 2"));
  }

  @Test
  public void threeElementsTest() {
    assertEquals("Incorrect result for array [1, 3, 2].", 
    		"2", problem.run("3\n1 3 2"));
  }
  
  @Test
  public void fourElementsTest() {
    assertEquals("Incorrect result for array [1, 2, 3, 4].", 
    		"3", problem.run("4\n1 2 3 4"));
  }

  @Test
  public void sameElementsTest() {
    assertEquals("Incorrect result for array [10, 10, 10].", 
    		"10", problem.run("3\n10 10 10"));
  }
  
  @Test
  public void negativeElementsTest() {
    assertEquals("Incorrect result for array [-2 10 -2 -2].", 
    		"-2", problem.run("4\n-2 10 -2 -2"));
  }
  
  @Test
  public void reverseSortedTest() {
    assertEquals("Incorrect result for array [60 10 -2 -4 -6 -1001].", 
    		"10", problem.run("5\n60 10 -2 -4 -6 -1001"));
  }

}
