// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.


// p	=	initial principal balance
// r	=	annual interest rate
// t	=	time (in years)

import java.util.Scanner;

public class Interest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter principal balance : ");
    double p = in.nextDouble();
    System.out.print("Enter time (in years) : ");
    double t = in.nextDouble();
    System.out.print("Enter annual interest rate(%) : ");
    double r = in.nextDouble();

    double interest = p * r * t / 100;
    System.out.println("Simple interest = " + interest);
    double amount =p + (p * r * t / 100);
    System.out.println("Toat amount after " + t + " year = " + amount);
  }
}