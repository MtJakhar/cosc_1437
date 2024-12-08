package GuildManagement;

public class InvalidLevelException extends Exception {
  public InvalidLevelException() {
    super("Error: Your level is less than one");
  }
}
