package EnchantedBeasts;

public class FairyDragon extends EnchantedBeast implements CanFly, CanTurnInvisible {
  public FairyDragon(String name, int magicalPower, int hitPoints) throws InvalidMagicalPowerException {
    super(name, magicalPower, hitPoints);
  }

  public void defend() {
    System.out.println("Fairy Dragon defends");
  }

  public void useAbility() {
    System.out.println("Cast magical Tricks");
  }

  public void fly(int distance) {
    System.out.println("Dragon flys " + distance + " feet");
  }

  public void vanish() {
    System.out.println("Dragon turns invisible");
  }
}
