package GuildManagement;

public class Mage extends Adventurer {
  public Mage(String name, int level) throws InvalidLevelException {
    super(name, level, "Mage");
  }

  // methods
  @Override
  public void performAction() {
    System.out.println("Disappears into the shadows");
  }

  public void goOnQuest() {
    System.out.println("By the power of ancient wisdom and arcane flames, I shall bend fate to my will.");
  }
}
