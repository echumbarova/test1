package main;

import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    System.out.println("Choose a problem number:");
    System.out.println();
    System.out.println("========= SIMPLE =========");
    System.out.println("\t1. Second biggest number");
    System.out.println("\t2. Decomposition into prime numbers");
    System.out.println("\t3. Polyndrom checker");
    System.out.println("\t4. ExchangesMoney");
    System.out.println("\t5. FindSubstring");
    System.out.println();
    System.out.println("========= INTERMEDIATE =========");
    System.out.println("\t6. Nth metric");
    System.out.println("\t7. Run-length string encoding");
    System.out.println("\t8. Run-length string decoding");

    Scanner scanner = new Scanner(System.in);
    int problemNumber = scanner.nextInt();
    Problem problem = Problem.forNumber(problemNumber);

    System.out.println("Run\\test?(r\\t)");
    String runProblem = scanner.next();
    if (runProblem.trim().toLowerCase().equals("r")) {
      problem.run();
    } else {
      problem.test();
    }
    scanner.close();
  }

}
