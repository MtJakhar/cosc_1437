package MagicalMountsAdventure;

public class Dragon extends MagicalMount implements CombatReady {
  public Dragon() throws InvalidLegCountException, InvalidSpeedException {
    super(80, 4);
  }

  public Dragon(int speed, int legs) throws InvalidLegCountException, InvalidSpeedException {
    super(speed, legs);
  }

  // methods
  public void attack() {
    System.out.println("Dragon spits fire at Enemies.");
  }

  public void defend() {
    System.out.println("Dragon's skin glows and is tougher than steel");
  }
}
