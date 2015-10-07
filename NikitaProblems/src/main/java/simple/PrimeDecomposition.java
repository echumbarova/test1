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
		int i=2;
		List<Integer> result = new ArrayList<Integer>();

		while (i <= Math.floor(Math.sqrt(number))) {			
			result.add(i);										
		out.println(result.toString());
		}
	}

}
