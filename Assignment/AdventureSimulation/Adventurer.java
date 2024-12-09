package AdventureSimulation;

public abstract class Adventurer {
  private String name;
  private int health;
  private int level;
  private String role;

  public Adventurer(String name, int health, int level) throws InvalidLevelException, HealthTooLowException {
    if (health < 1)
      throw new HealthTooLowException();
    if (level > 20 || level < 1)
      throw new InvalidLevelException();
    this.name = name;
    this.health = health;
    this.level = level;
  }

  // methods
  // getters
  public String getName() {
    return name;
  }

  public int getHealth() {
    return health;
  }

  public int getLevel() {
    return level;
  }

  public String getRole() {
    return role;
  }

  // setters
  public void setHealth(int health) {
    this.health = health;
  }

  public void setRole(String role) {
    this.role = role;
  }

  // Must have health >50 and be level 5 or higher
  public boolean checkReadiness() {
    int currentLevel = getLevel();
    int currentHealth = getHealth();
    if (currentHealth > 50 && currentLevel > 5) {
      return true;
    }
    return false;
  }

  public void takeDamage() {
    health -= 10;
  }

  public abstract void attack();

  public abstract void defend();

  public abstract void rest(int hours);

}
