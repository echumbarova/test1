package simple;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import main.Problem;

public class PolyndromChecker extends Problem {

	@Override
	public void runFromInput(Scanner scanner, boolean skipPrompts,
			PrintStream out) {
		if (!skipPrompts) {
			System.out.println("Enter a word:");
		}
		String word = scanner.nextLine();
		if (word == null) {
			out.println("Nan");
			return;
		}
    String original = word;
    String reverse = "";
    int length = original.length();

    for (int i = length - 1; i >= 0; i--) {
        reverse = reverse + original.charAt(i);
    }          

		out.println(reverse.toString());
	}
}