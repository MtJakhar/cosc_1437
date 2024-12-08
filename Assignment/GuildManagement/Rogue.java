package GuildManagement;

public class Rogue extends Adventurer implements QuestReady {
  public Rogue(String name, int level) throws InvalidLevelException {
    super(name, level, "Rogue");
  }

  // methods
  public void performAction() {
    System.out.println("Disappears into the shadows!");
  }

  public void goOnQuest() {
    System.out.println("Shadows are my shield, silence my ally — unseen, unheard, unstoppable.");
  }
}
