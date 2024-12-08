package GuildManagement;

public class Warrior extends Adventurer implements QuestReady {
  public Warrior(String name, int level) throws InvalidLevelException {
    super(name, level, "Warrior");
  }

  // methods
  @Override
  public void performAction() {
    System.out.println("Swings a mighty sword!");
  }

  public void goOnQuest() {
    System.out.println("With steel in hand and honor in heart, I march toward destiny, unyielding and unstoppable.");
  }
}
