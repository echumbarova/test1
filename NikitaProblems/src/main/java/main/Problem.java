package main;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import simple.SecondBiggestNumber;

public abstract class Problem {

  /**
   * Runs the problem solution with input from System.in.
   */
  public void run() {
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.lineSeparator() + "|\\s");
    runFromInput(scanner, false, new PrintStream(System.out));
    scanner.close();
  }

  /**
   * Testable class that implements problem solution.
   *
   * @param scanner
   * @param skipPrompts whether user prompts should be printed.
   */
  public abstract void runFromInput(Scanner scanner, boolean skipPrompts, PrintStream out);

  /**
   * Runs tests and prints resuls in the console.
   */
  public void test() {
    String testClassName = this.getClass().getName() + "Test";
    Result result;
    try {
      result = JUnitCore.runClasses(Class.forName(testClassName));
    } catch (ClassNotFoundException e) {
      System.out.println("Test file is not found. " + testClassName);
      return;
    }
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
    System.out.println(result.wasSuccessful());
  }

  static Problem[] problemArray = {new SecondBiggestNumber()};

  public static Problem forNumber(int n) {
    Problem problem = problemArray[n - 1];
    return problem;
  }
}
