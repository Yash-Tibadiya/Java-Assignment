// Take 2 numbers as inputs and find their HCF(GCD) and LCM.
// GCD = largest integer that can exactly divide both numbers without any remainder
// LCM = num1 * num2 / GCD

// ex. num1=120 num2=72 GCD=24
// LCM = 72*120/24 = 360

import java.util.Scanner;

public class GCDandLCM {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int gcd = 0;
    int min = (num1 > num2) ? num2 : num1;

    for (int i = 1; i <= min; i++) {
      if (num1 % i == 0 && num2 % i == 0) {
        gcd = i;
      }
    }
    System.out.println("GCD is: " + gcd);
    int lcm = (num1 * num2) / gcd;
    System.out.println("LCM is :" + lcm);

  }
}
