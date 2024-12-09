package AdventureSimulation;

public class HealthTooLowException extends Exception {
  public HealthTooLowException() {
    super("Health is set below 1. You are Dead");
  }
}
