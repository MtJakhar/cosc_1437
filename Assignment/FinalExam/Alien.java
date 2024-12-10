
public class Alien {
  protected int damagePoints;

  public Alien() throws NoDamage {
    throw new NoDamage();
  }

  public Alien(int damagePoints) {
    this.damagePoints = damagePoints;
  }

  // method
  public int getDamagePoints() {
    return damagePoints;
  }

  public void setDamagePoints(int damagePoints) {
    this.damagePoints = damagePoints;
  }

  public String toString() {
    String str = "This alien does " + this.damagePoints + " damage points.";
    return str;
  }
}
