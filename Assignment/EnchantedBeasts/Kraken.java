package EnchantedBeasts;

public class Kraken extends EnchantedBeast implements CanSwim {
  public Kraken(String name, int magicalPower, int hitPoints) throws InvalidMagicalPowerException {
    super(name, magicalPower, hitPoints);
  }

  public void swim(int distance) {
    System.out.println("Kraken swims " + distance + "feet");
  }

  public void defend() {
    System.out.println("Kraken Defends");
  }

  public void useAbility() {
    System.out.println("Tentacle attack.");
  }

}
