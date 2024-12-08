package GuildManagement;

public abstract class Adventurer {
  private String name;
  private int level;
  private String classType;

  // constructor
  public Adventurer(String name, int level, String classType) throws InvalidLevelException {
    this.name = name;
    if (level > 0) {
      this.level = level;
    } else {
      throw new InvalidLevelException();
    }
    this.classType = classType;
  }

  // methods
  public void levelUp() {
    level++;
  };

  public abstract void performAction();

  // getters
  public String getName() {
    return name;
  }

  public int getLevel() {
    return level;
  }

  public String getClassType() {
    return classType;
  }

}
