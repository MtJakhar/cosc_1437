
public class RattlesnakeAlien extends Alien {
  private String sound;

  public RattlesnakeAlien(int damagePoints, String sound) {
    super(damagePoints);
    this.sound = sound;
  }

  // methods
  public String getSound() {
    return sound;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public String toString() {
    String str = super.toString() + " It goes " + this.sound + "!";
    return str;
  }
}
