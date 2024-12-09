package EnchantedBeasts;

public class Phoenix extends EnchantedBeast implements CanFly {
  public Phoenix(String name, int magicalPower, int hitPoints) throws InvalidMagicalPowerException {
    super(name, magicalPower, hitPoints);
  }

  public void fly(int distance) {
    System.out.println("Phoenix flys " + distance + " feet in a direction");
  }

  public void useAbility() {
    System.out.println("Revives itself when defeated");
  }

  public void defend() {
    System.out.println("Phoenix defends itself");
  }
}
