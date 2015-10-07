package simple;

import java.io.PrintStream;
import java.util.Scanner;

import main.Problem;

public class PrimeDecomposition extends Problem {

  @Override
  public void runFromInput(Scanner scanner, boolean skipPrompts, PrintStream out) {
    if (!skipPrompts) {
      System.out.println("Enter the number:");
    }
    int number = scanner.nextInt();
    if (number <= 0) {
        // Array is empty.
        out.println("Nan");
        return;
      }
  }

}
