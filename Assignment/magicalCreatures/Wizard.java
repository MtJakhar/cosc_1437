package magicalCreatures;

public class Wizard extends MagicalCreature implements QuestParticipant {
  public Wizard(String name, int health, int mana, int strength) {
    super(name, health, mana, strength);
  }

  @Override
  public void attack(MagicalCreature target) {
    System.out.println(getName() + " attacks " + target.getName());
  }

  @Override
  public void defend() {
    System.out.println(getName() + " defends themselves");
  }

  public void castSpell() {
    int currentMana = getMana();
    if (currentMana >= 10) {
      System.out.println(getName() + "casts a spell");
      setMana(currentMana - 10);
    } else {
      System.out.println("You cant cast spell, you are out of mana");
    }
  }

}
