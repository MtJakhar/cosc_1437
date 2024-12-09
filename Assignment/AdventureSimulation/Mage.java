package AdventureSimulation;

public class Mage extends Adventurer implements QuestParticipant {
  private String role = "Mage";

  public Mage(String name, int health, int level) throws HealthTooLowException, InvalidLevelException {
    super(name, health, level);
    setRole(role);
  };

  // methods
  @Override
  public void attack() {
    System.out.println(getName() + " Mage casts Fireball");
  }

  @Override
  public void defend() {
    System.out.println(getName() + " Mage conjures a magical barrier!");
  }

  @Override
  public void rest(int hours) {
    int currentHealth = getHealth();
    int restoredHealth = currentHealth + (hours * 2);
    if (currentHealth >= 1) {
      if (restoredHealth > 100) {
        setHealth(100);
      } else {
        setHealth(restoredHealth);
      }
    }
  }

  @Override
  public void startQuest() {
    System.out.println("The secrets of the arcane await — let the quest begin!");
  }
}
