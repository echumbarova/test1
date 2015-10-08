package simple;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.Problem;

public class PrimeDecomposition extends Problem {

	@Override
	public void runFromInput(Scanner scanner, boolean skipPrompts,
			PrintStream out) {
		if (!skipPrompts) {
			System.out.println("Enter the number:");
		}
		int number = scanner.nextInt();
		if (number <= 0) {
			out.println("Nan");
			return;
		}
		int i = 2;
		int n = number;
		List<Integer> result = new ArrayList<Integer>();
		double m = Math.sqrt(n);
		while (i < m) {
			if (n % i == 0) {
				n = n / i;
				result.add(i);
			} else {
				i++;
			}
		}
		out.println(result.toString());
	}

}
