package magicalCreatures;

import java.util.Random;

public abstract class MagicalCreature {
  private String name;
  private int health;
  private int mana;
  private int strength;

  public MagicalCreature(String name, int health, int mana, int strength) {
    this.name = name;
    this.health = health;
    this.mana = mana;
    this.strength = strength;
  }

  // methods
  // getter
  public int getHealth() {
    return health;
  }

  public int getStrength() {
    return strength;
  }

  public String getName() {
    return name;
  }

  public int getMana() {
    return mana;
  }

  public void setMana(int mana) {
    this.mana = mana;
  }

  // other methods
  public void rest() {
    Random randomNumber = new Random();
    int randomHeal = randomNumber.nextInt(50) + 1;
    int randomRestore = randomNumber.nextInt(50) + 1;

    if (health < 100) {
      if (health + randomHeal > 100) {
        health = 100;
      } else {
        health += randomHeal;
      }
    }
    if (mana < 100) {
      if (mana + randomRestore > 100) {
        mana = 100;
      } else {
        mana += randomRestore;
      }
    }
    if (mana == 100 && health == 100) {
      System.out.println("You are fully restored");
    }
  }

  public abstract void attack(MagicalCreature target);

  public abstract void defend();
}
