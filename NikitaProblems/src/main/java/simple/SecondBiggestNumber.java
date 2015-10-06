package simple;

import java.io.PrintStream;
import java.util.Scanner;

import main.Problem;

public class SecondBiggestNumber extends Problem {
	
	@Override
	public void runFromInput(Scanner scanner, boolean skipPrompts, PrintStream out) {
		if (!skipPrompts) {
			System.out.println("Enter the number of elements:");
		}
		int numberOfItems = scanner.nextInt();
		if (!skipPrompts) {
			System.out.println("Enter the array elements separated with spaces:");
		}
		
		if (numberOfItems <= 0) {
		  // Array is empty.
		  out.println("Nan");
		  return;
		}
		
		int[] array = new int[numberOfItems];
		for (int i = 0; i < numberOfItems; i++) {
			array[i] = scanner.nextInt();
		}
		
		
		// Output result here:
		out.println();
	}


}