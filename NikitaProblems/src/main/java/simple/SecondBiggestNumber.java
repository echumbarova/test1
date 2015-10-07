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
		max = 0;
		secondMax = 0;
	    if(array[i]>(array[i+1])){
	    	max = array[i];
	        secondMax = array[i+1];
	        else
		    max = array[i+1];
	        secondMax = array[i];
	    }
	    for ( array[i+2]; array[i+2] < numberOfItems; array[i+2]++) {
	    	if(array[i+2]>(secondMax){
	    		
	    	}
	    }
		// Output result here:		
		out.println(secondMax);
	}


}