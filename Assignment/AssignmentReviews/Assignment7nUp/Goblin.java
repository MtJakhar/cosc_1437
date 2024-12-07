
public class Goblin extends Character implements Creature, OrcKin {
  int goblinRank;

  public Goblin() {
    super();
    this.goblinRank = 1;
  }

  public Goblin(int health, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma,
      int goblinRank) {
    super(health, strength, dexterity, constitution, intelligence, wisdom, charisma);
    this.goblinRank = goblinRank;
  }

  @Override
  public void eatCorpse() {
    System.out.println("Goblin eats a corpse and restores health");
  }

  @Override
  public void servantOfDarkness() {
    System.out
        .println("Goblin feels evil coursing through its veins, it gains +2 to Strength, Dexterity, and Constitution");
  }

  @Override
  public void intimidate() {
    System.out.println("Goblin thumps its chest");
  }

  @Override
  public void callReinforcements() {
    System.out.println("Goblin screams for allies to come to battle");
  }

}
