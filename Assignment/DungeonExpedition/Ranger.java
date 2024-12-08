package DungeonExpedition;

public class Ranger extends Character implements QuestParticipant {
  public Ranger(String name, int level) throws InvalidLevelException {
    super(name, level);
  }

  // method
  public void action() {
    System.out.println("Fires a deadly arrow from the shadows!");
  }

  public void startQuest() {
    System.out.println("Silent as the wind, sharp as an arrow — I hunt what others fear.");
  }

  public void completeQuest() {
    System.out.println("The wilds have tested me, and I return stronger than ever.");
  }

}
