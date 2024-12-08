package DungeonExpedition;

public class Fighter extends Character implements QuestParticipant {
  public Fighter(String name, int level) throws InvalidLevelException {
    super(name, level);
  }

  // method
  public void action() {
    System.out.println("Charges into battle with a heavy weapon!");
  }

  public void startQuest() {
    System.out.println("Strength and steel will carve my path through this world!");
  }

  public void completeQuest() {
    System.out.println("Victory is mine! None can stand against my might!");
  }
}
