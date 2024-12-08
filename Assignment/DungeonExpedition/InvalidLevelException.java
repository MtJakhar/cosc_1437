package DungeonExpedition;

public class InvalidLevelException extends Exception {
  public InvalidLevelException() {
    super("Error: Your level is less than 1.");
  }
}
