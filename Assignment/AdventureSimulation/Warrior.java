package AdventureSimulation;

public class Warrior extends Adventurer implements QuestParticipant {
  private String role = "Warrior";

  public Warrior(String name, int health, int level) throws HealthTooLowException, InvalidLevelException {
    super(name, health, level);
    setRole(role);
  }

  // methods
  @Override
  public void attack() {
    System.out.println(getName() + " strikes with a mighty sword!");
  }

  @Override
  public void defend() {
    System.out.println(getName() + " raises a shield!");
  }

  @Override
  public void rest(int hours) {
    int currentHealth = getHealth();
    int restoredHealth = currentHealth + (hours * 5);
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
    System.out.println("For honor and glory, I march into the unknown!");
  }
}
