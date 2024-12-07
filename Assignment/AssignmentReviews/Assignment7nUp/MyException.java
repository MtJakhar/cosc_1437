package AssignmentReviews.Assignment7nUp;

public class MyException extends Exception {
  public MyException() {
    // this super allows you to use this as the custom message you get from
    // e.getMessage() error.
    super("Error: Negative starting balance");
  }
}
