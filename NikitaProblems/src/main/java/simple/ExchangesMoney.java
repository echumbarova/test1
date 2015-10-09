package simple;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.Problem;

public class ExchangesMoney extends Problem {

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
		int n = number;
		List<Integer> result = new ArrayList<Integer>();
		for (int x = 0; (n - 3 * x) / 5 > 0; x++) {
			n = n - 3;
			result.add(x);
		}
		if (n / 5 > 0) {
			int y = n / 5;
			result.add(y);
		}
		out.println(result.toString());
	}
}