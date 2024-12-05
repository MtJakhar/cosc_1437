package AssignmentReviews.assignment4andMore;

public class MethodsFormat {
  public static void main(String[] args) {
    // call a method
    displayMessage();
    displayValue(22);
    multiply(2.0, 3.0);
    System.out.println(sum(1, 2));
  }

  /*
   * method header
   * public static - is the method modifier
   * void - is the return type
   * displayMessage - is the method name
   * () - parentheses
   * 
   */
  public static void displayMessage() {
    System.out.println("Hello from the displayMessage method.");

  }

  // use can pass data or arguments into a method
  public static void displayValue(int num) {
    System.out.println("The value is " + num);
  }

  // u can pass multi arguments in to a method
  public static void multiply(double num1, double num2) {
    double total = num1 * num2;
    System.out.println("the multiple is " + total);
  }

  // value returning method, returns value based on the datatype of return value
  public static int sum(int num1, int num2) {
    return num1 + num2;
  }

  // return type boolean
  public static boolean isLessThan10(int num) {
    if (num < 10) {
      return true;
    }
    return false;
  }

  // return String
  public static String fullName(String first, String last) {
    return first + " " + last;
  }
}
