package AssignmentReviews.AssignmentPrac;

public class MotorVehicle {
  private char gear;
  private int wheels;

  public MotorVehicle() {
    setGear('P');
    setWheels(2);
  }

  public MotorVehicle(char gear, int wheels) {
    setGear(gear);
    setWheels(wheels);
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
