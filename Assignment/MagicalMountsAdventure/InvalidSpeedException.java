package MagicalMountsAdventure;

public class InvalidSpeedException extends Exception {
  public InvalidSpeedException() {
    super("Error: this Magical mount is to slow to be a mount");
  }
}
