package AdventureSimulation;

public class Rogue extends Adventurer implements QuestParticipant {
  private String role = "Rogue";

  public Rogue(String name, int health, int level) throws HealthTooLowException, InvalidLevelException {
    super(name, health, level);
    setRole(role);
  }

  // methods
  @Override
  public void attack() {
    System.out.println(getName() + " backstabs with precision!");
  }

  @Override
  public void defend() {
    System.out.println(getName() + " dodges swiftly");
  }

  @Override
  public void rest(int hours) {
    int currentHealth = getHealth();
    int restoredHealth = currentHealth + (hours * 3);
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
    System.out.println("The shadows guide me — let’s see what fortune awaits!");
  }
}
