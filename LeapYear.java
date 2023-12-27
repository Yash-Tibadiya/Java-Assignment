// Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int year = in.nextInt();

    if (year % 4 == 0) {
      System.out.println("LeapYear");
    } else {
      System.out.println("not leap year");
    }
  }
}