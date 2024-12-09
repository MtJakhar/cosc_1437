package EnchantedBeasts;

public class InvalidMagicalPowerException extends Exception {
  public InvalidMagicalPowerException() {
    super("Error: magicalPower is set below 1 or above 100");
  }
}
