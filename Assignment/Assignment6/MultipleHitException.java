public class MultipleHitException extends Exception {
  public MultipleHitException() {
    super("Note: Ship has already been hit, please enter a different coordinate");
  }
}
