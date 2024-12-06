package AssignmentReviews.Assignment7nUp;

import java.util.Scanner;

public class Wrappers {
  /*
   * wrappers allow you to make these primitive data types act like objects, Also
   * the wrappers allow you to use useful methods to manipuate the datatype the
   * wrapper class represents
   */
  public static void main(String[] args) {
    char ch;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter any single character: ");
    ch = scanner.nextLine().charAt(0);

    if (Character.isLetter(ch)) {
      System.out.println("That is a letter");
    }
    if (Character.isDigit(ch)) {
      System.out.println("That is a digit.");
    }
    if (Character.isLowerCase(ch)) {
      System.out.println("That is a lowercase letter");
    }
    if (Character.isUpperCase(ch)) {
      System.out.println("That is an uppercase letter");
    }
    if (Character.isSpaceChar(ch)) {
      System.out.println("That is a space");
    }
    if (Character.isWhitespace(ch)) {
      System.out.println("That is a whitespace characer");
    }
    System.out.println(Character.toLowerCase(ch));
    System.out.println(Character.toUpperCase(ch));
  }
}
