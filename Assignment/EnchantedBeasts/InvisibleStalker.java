package EnchantedBeasts;

public class InvisibleStalker extends EnchantedBeast implements CanTurnInvisible {
  public InvisibleStalker(String name, int magicalPower, int hitPoints) throws InvalidMagicalPowerException {
    super(name, magicalPower, hitPoints);
  }

  public void defend() {
    System.out.println("Stalker defends itself");
  }

  public void useAbility() {
    System.out.println("Surprise attack");
  }

  public void vanish() {
    System.out.println("Stalker turns invisible");
  }
}
