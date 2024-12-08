package MagicalMountsAdventure;

public class MagicalMount {
  private int speed;
  private int legs;

  public MagicalMount() {
    speed = 30;
    legs = 4;
  }

  public MagicalMount(int speed, int legs) throws InvalidLegCountException, InvalidSpeedException {
    if (speed >= 1) {
      this.speed = speed;
    } else {
      throw new InvalidSpeedException();
    }
    if (legs >= 2) {
      this.legs = legs;
    } else {
      throw new InvalidLegCountException();
    }
  }

  // methods
  public void moveForward() {
    System.out.println("The mount advances swiftly!");
  }

  public void moveBackward() {
    System.out.println("The mount retreats cautiously.");
  }

  public void changeSpeed(int newSpeed) throws InvalidSpeedException {
    if (newSpeed >= 1) {
      this.speed = newSpeed;
    } else {
      throw new InvalidSpeedException();
    }
  }
}
