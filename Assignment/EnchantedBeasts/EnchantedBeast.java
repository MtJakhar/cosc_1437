package EnchantedBeasts;

public abstract class EnchantedBeast {
  private String name;
  private int magicalPower;
  private int hitPoints;

  public EnchantedBeast(String name, int magicalPower, int hitPoints) throws InvalidMagicalPowerException {
    this.name = name;
    if (magicalPower >= 1 && magicalPower <= 100) {
      this.magicalPower = magicalPower;
    } else {
      throw new InvalidMagicalPowerException();
    }
    this.hitPoints = hitPoints;
  }

  public abstract void useAbility();

  public abstract void defend();

}
