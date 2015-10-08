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
		int x = 0;
		List<Integer> result = new ArrayList<Integer>();
		int y = (n - 3* (x)) / 5;
		while (x<n/3){
			if (n % i == 0) {
				n = n / i;
				result.add(i);
			} else {
				i++;
			}
		}
		if (n > 1) {
			result.add(n);
		}
		out.println(result.toString());
	}

}