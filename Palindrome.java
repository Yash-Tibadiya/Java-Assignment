// To find out whether the given String is Palindrome or not.
// A palindrome is a word, phrase, number, or other sequence of symbols that reads the same backwards as forwards. 
// like civic,deified,Madam,level,anna

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = in.nextLine();
    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.charAt(i);
      // System.out.println(reverse);
    }
    if (str.equals(reverse)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }
}
