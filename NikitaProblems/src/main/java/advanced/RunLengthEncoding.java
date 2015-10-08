package advanced;

import java.io.PrintStream;
import java.util.Scanner;

import main.Problem;

public class RunLengthEncoding extends Problem{

	@Override
	public void runFromInput(Scanner scanner, boolean skipPrompts,
			PrintStream out) {
		if (!skipPrompts) {
			System.out.println("Enter the string to encode:");
		}
		String source = scanner.next();
		StringBuffer dest = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            int runLength = 1;
            while (i+1 < source.length() && source.charAt(i) == source.charAt(i+1)) {
                runLength++;
                i++;
            }
            dest.append(runLength);
            dest.append(source.charAt(i));
        }
        out.println(dest.toString());
	}

}
