package DungeonExpedition;

public class Wizard extends Character implements QuestParticipant {
  public Wizard(String name, int level) throws InvalidLevelException {
    super(name, level);
  }

  // methods
  public void action() {
    System.out.println("Casts an ancient spell of destruction!");
  }

  public void castSpell(String spell) {
    System.out.println("Casting " + spell + "!");
  }

  public void startQuest() {
    System.out.println("The secrets of the arcane guide my journey — let destiny be rewritten!");
  }

  public void completeQuest() {
    System.out.println("The stars have aligned, and fate now bows to my power.");
  }
}
