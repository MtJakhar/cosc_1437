package AssignmentReviews.AssignmentPrac;

public class CheckGearsException extends Exception {
  public CheckGearsException() {
    super("Error: The gear you hae entered is not either of the following P, R, D, N, 1, or 2");
  }
}
