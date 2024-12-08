package DungeonExpedition;

import java.util.ArrayList;

public abstract class Character {
  private String name;
  private int level;
  private int health = 100;
  private ArrayList<String> inventory = new ArrayList<String>();

  public Character(String name, int level) throws InvalidLevelException {
    this.name = name;
    if (level <= 0) {
      throw new InvalidLevelException();
    } else {
      this.level = level;
    }
  }

  // methods
  public abstract void action();

  public int getHealth() {
    return health;
  }

  public String getName() {
    return name;
  }

  public int getLevel() {
    return level;
  }

  public void addItem(String item) throws InventoryFullException {
    if (inventory.size() > 5) {
      throw new InventoryFullException();
    } else {
      inventory.add(item);
    }
  }

  public void levelUp() {
    level++;
  }

  public void takeDamage(int damage) throws CharacterDefeatedException {
    health -= damage;
    if (health <= 0) {
      throw new CharacterDefeatedException();
    }
  }

  public void heal(int amount) {
    health += amount;
    if (health >= 100) {
      health = 100;
    }
  }
}
