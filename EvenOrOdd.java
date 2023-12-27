// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number: ");
    int number = in.nextInt();

    if (number % 2 == 0) {
      System.out.println("Number is even");
    } else {
      System.out.println("Number is odd");
    }
  }
}
