public class formattedOutpu {
  public static void main(String[] args) {
    /*
     * print f allows you to format the string in various was
     * every format must have a % in front of it
     * d is for ints, and f is for floats and double, s is for strings
     * adding .2, or .3 indicates decimal places
     */
    int num1 = 4;
    double num2 = 4.4444;
    System.out.printf("this is a string with three numbers %d, %.2f, %.3f, %f\n", num1, num2, num2, num2);

    /*
     * you can add a , infront of format specifier to make commas appear
     */
    int num3 = 1000000;
    double num4 = 1000000.000;
    String stringOne = "this is a string with numbers and commas: ";
    System.out.printf("%s %,d and %,.2f \n", stringOne, num3, num4);

    /*
     * String has a format method which uses these format specifiers
     */

    String stringTwo = String.format("Your annaul pay is $%,.2f\n", num4);
    System.out.println(stringTwo);
  }
}
