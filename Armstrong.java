// To find Armstrong Number between two given number.
// An Armstrong number is a special kind of number in math. It's a number that equals the sum of its digits, each raised to a power. 
// For example, if you have a number like 153, it's an Armstrong number because 1^3 + 5^3 + 3^3 equals 153.
//1634 = 1^4 + 6^4 + 3^4 + 4^4
//6 = 6^1

import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the Starting  number: ");
    int start = in.nextInt();
    System.out.print("Enter the Ending number: ");
    int end = in.nextInt();

    System.out.print("Armstrong numbers between " + start + " and " + end + " : ");
    for (int i = start; i <= end; i++) {

      // number of digits calculation
      int x = i;
      int n = 0;
      while (x != 0) {
        x = x / 10;
        ++n;
      }

      // compute sum of nth power of
      // its digits
      int pow_sum = 0;
      x = i;
      while (x != 0) {
        int digit = x % 10;
        pow_sum += Math.pow(digit, n);
        x = x / 10;
      }

      // checks if number i is equal
      // to the sum of nth power of
      // its digits
      if (pow_sum == i) {
        System.out.print(i + " ");
      }

    }
  }
}
