package advanced;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

import main.Problem;

public class NthMetric extends Problem{

	@Override
	public void runFromInput(Scanner scanner, boolean skipPrompts,
			PrintStream out) {
		if (!skipPrompts) {
	      System.out.println("Enter the metric number:");
	    }
		int n = scanner.nextInt();
		if (n <= 0) {
		  out.println("Invalid metric value");
	      return;
		}
		if (!skipPrompts) {
	      System.out.println("Enter the number of elements:");
	    }
	    int numberOfItems = scanner.nextInt();
	    if (!skipPrompts) {
	      System.out.println("Enter the array elements separated with spaces:");
	    }

	    if (numberOfItems < n) {
	      // Array is smaller than metric.
	      out.println("Nan");
	      return;
	    }

	    int[] array = new int[numberOfItems];
	    for (int i = 0; i < numberOfItems; i++) {
	      array[i] = scanner.nextInt();
	    }
	    
	    Arrays.sort(array);
	    out.println(array[n]);	    
	}

}
