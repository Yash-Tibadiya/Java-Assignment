// Input currency in rupees and output in USD

import java.util.Scanner;

public class RupeesToDollars {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the amount in rupees: ");
    double rupees = in.nextDouble();
    double dollars = rupees / 83.1725;
    System.out.println("amount in dollars: " + dollars);
  }
}
