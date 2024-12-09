package AdventureSimulation;

public class QuestFailedException extends Exception {
  public QuestFailedException() {
    super("You have Failed your readiness check");
  }
}
