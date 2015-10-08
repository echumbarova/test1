package simple;

import java.io.PrintStream;
import java.util.Scanner;

import main.Problem;

public class PolyndromChecker extends Problem {

  @Override
  public void runFromInput(Scanner scanner, boolean skipPrompts, PrintStream out) {
		if (!skipPrompts) {
			System.out.println("Enter a word:");
		}
		String word = scanner.nextLine();
		if (word==null) {
			out.println("Nan");
			return;

  }

}
}