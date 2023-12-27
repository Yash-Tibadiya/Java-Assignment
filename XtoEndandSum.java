// // Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class XtoEndandSum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int sum = 0;

    while (true) {
      System.out.print("Enter a number ('X' or 'x' to exit) : ");
      String input = in.nextLine();
      if (input.equals("x") || input.equals("X")) {
        break;
      } else {
        int num = Integer.parseInt(input);
        sum = sum + num;
      }
    }
    System.out.println("sum = " + sum);

  }
}

// #chatgpt

// import java.util.ArrayList;
// import java.util.Scanner;

// public class XtoEndandSum {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// ArrayList<Integer> numbers = new ArrayList<>();

// while (true) {
// System.out.print("Enter a number (enter 'x' to stop): ");
// String input = scanner.nextLine();

// if (input.equalsIgnoreCase("x")) {
// break;
// }

// try {
// int number = Integer.parseInt(input);
// numbers.add(number);
// } catch (NumberFormatException e) {
// System.out.println("Invalid input. Please enter a number or 'x' to stop.");
// }
// }

// if (!numbers.isEmpty()) {
// int sum = 0;
// for (int num : numbers) {
// sum += num;
// }
// System.out.println("The sum of the numbers entered is: " + sum);
// } else {
// System.out.println("No numbers were entered.");
// }
// }
// }
