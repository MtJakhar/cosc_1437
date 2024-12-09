package AdventureSimulation;

public class InvalidLevelException extends Exception {
  public InvalidLevelException() {
    super("Error: your level is outside the 1-20 range.");
  }
}
