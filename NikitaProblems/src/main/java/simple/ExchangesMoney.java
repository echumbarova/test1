package simple;

import java.io.PrintStream;
import java.util.Scanner;

import main.Problem;

public class ExchangesMoney extends Problem {

  @Override
  public void runFromInput(Scanner scanner, boolean skipPrompts, PrintStream out) {
    if (!skipPrompts) {
      System.out.println("Enter the number:");
    }
    int n = scanner.nextInt();
    // Handle edge cases.
    if (n <= 0) {
      out.println("Nan");
      return;
    }
    // Handle cases when exchange is not possible.
    if (n < 3 || n == 4 || n == 7) {
      out.println("Not possible");
      return;
    }
    for (int x = 0; x <= n / 3; x++) {
      if ((n - 3 * x) % 5 == 0) {
        out.println("3*" + x + " + 5*" + (n - 3 * x) / 5);
      }
    }
  }
}
