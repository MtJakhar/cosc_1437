package MagicalMountsAdventure;

public class GiantSpider extends MagicalMount implements CombatReady {
  public GiantSpider() throws InvalidLegCountException, InvalidSpeedException {
    super(40, 8);
  }

  public GiantSpider(int speed, int legs) throws InvalidLegCountException, InvalidSpeedException {
    super(speed, legs);
  }

  // method
  public void attack() {
    System.out.println("Giant Spider shoots acid at its enemies");
  }

  public void defend() {
    System.out.println("The Giant spider takes a defensive stance by shoot web around it.");
  }
}
