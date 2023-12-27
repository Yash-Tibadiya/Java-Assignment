// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = in.nextInt();
    int a = 0;
    int b = 1;
    int count = 3;

    if (num == 1) {
      System.out.println(a);
    } else {
      while (count <= num) {
        int temp = b;
        b = b + a;
        a = temp;
        count++;
      }
      System.out.println(b);
    }
  }
}
