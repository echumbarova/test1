package simple;

import java.io.PrintStream;
import java.util.Scanner;

import main.Problem;

public class FindSubstring extends Problem {

	@Override
	public void runFromInput(Scanner scanner, boolean skipPrompts,
			PrintStream out) {
		if (!skipPrompts) {
			System.out.println("Enter the string:");
		}
		String str = scanner.nextLine();
		if (str == null) {
			out.println("Nan");
			return;
		}
		if (!skipPrompts) {
			System.out.println("Enter the substring:");
		}
		String search = scanner.nextLine();
		if (search == null) {
			out.println("Nan");
			return;
		}
		int lenStr = str.length();
		int lenSearch = search.length();
		for (int i = 0; lenStr > lenSearch; i++) {

			str.equals(search);
		}
		System.out.println(lenStr);
		System.out.println(lenSearch);
		out.println(str.equals(search));
	}
}