package main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import advanced.NthMetric;
import advanced.RunLengthDecoding;
import advanced.RunLengthEncoding;
import simple.FindSubstring;
import simple.ExchangesMoney;
import simple.PolyndromChecker;
import simple.PrimeDecomposition;
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
	 * Method for testing. Runs the problem solution using n as input string and
	 * returns result as String.
	 * 
	 * @param n
	 * @return
	 */
	public String run(String n) {
		Scanner scanner = new Scanner(n + "\n");
		scanner.useDelimiter(System.lineSeparator() + "|\\s");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(baos);
		this.runFromInput(scanner, true, out);
		return baos.toString().trim();
	}

	/**
	 * Testable class that implements problem solution.
	 * 
	 * @param scanner
	 * @param skipPrompts
	 *            whether user prompts should be printed.
	 */
	public abstract void runFromInput(Scanner scanner, boolean skipPrompts,
			PrintStream out);

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

	static Problem[] problemArray = { new SecondBiggestNumber(),
			new PrimeDecomposition(), new PolyndromChecker(),
			new ExchangesMoney(), new simple.FindSubstring(),
			new NthMetric(), new RunLengthEncoding(),
			new RunLengthDecoding()};

	public static Problem forNumber(int n) {
		Problem problem = problemArray[n - 1];
		return problem;
	}
}
