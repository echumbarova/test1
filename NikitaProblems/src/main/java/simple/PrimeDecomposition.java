package simple;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
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
        out.println("Nan");
        return;
      }
    List<Integer> result = new ArrayList<Integer>();
    
    for (int i = 2, limit = (int)Math.ceil(Math.sqrt(number)); i <= limit; ) {
        if (number % i == 0) {
            number = number / i;
            limit = (int)Math.ceil(Math.sqrt(number));
            System.out.print(i + " ");
        }
        else {
            i++;
        }
    }
    if (number > 1) System.out.println(number);
  }

}
