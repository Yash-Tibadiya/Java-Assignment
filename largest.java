// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class largest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first number : ");
    double num1 = in.nextDouble();
    System.out.print("Enter second number : ");
    double num2 = in.nextDouble();

    if (num1 > num2) {
      System.out.println("Number " + num1 + " is bigger than number " + num2);
      System.out.println("So the largest number is " + num1);
    } else {
      System.out.println("Number " + num2 + " is bigger than number " + num1);
      System.out.println("So the largest number is " + num2);
    }
  }
}
