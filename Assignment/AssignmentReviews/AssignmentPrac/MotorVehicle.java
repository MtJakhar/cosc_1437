
public class MotorVehicle {
  private char gear;
  private int wheels;

  public MotorVehicle() {
    setGear('P');
    setWheels(2);
  }

  public MotorVehicle(char gear, int wheels) throws CheckGearsException, TwoWheelsException {
    switch (gear) {
      case 'P':
      case 'D':
      case 'N':
      case 'R':
      case '1':
      case '2':
        setGear(gear);
        break;
      default:
        throw new CheckGearsException();
    }

    if (wheels >= 2) {
      setWheels(wheels);
    } else {
      throw new TwoWheelsException();
    }

  }

  // getters
  public char getGear() {
    return gear;
  }

  public int getWheels() {
    return wheels;
  }

  // setters
  public void setGear(char gear) {
    this.gear = gear;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  // methods
  public void drive() {
    System.out.println("Going Forward");
  }

  public void reverse() {
    System.out.println("Going Backwards");
  }
}
