package MagicalMountsAdventure;

public class InvalidLegCountException extends Exception {
  public InvalidLegCountException() {
    super("Error the magical mount must have 2 or more legs");
  }
}
