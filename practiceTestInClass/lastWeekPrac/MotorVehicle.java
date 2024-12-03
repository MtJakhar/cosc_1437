package lastWeekPrac;

public class MotorVehicle {
  private int wheels;
  private String gear;

  public MotorVehicle(int wheels, String gear) {
    if (wheels < 2) {
      throw new NeedMoreWheels("The vehicle must have more than 2 wheels");
    }
    this.wheels = wheels;

    if (!gear.matches("P|R|D|N|1|2")) {
      throw new InvalidGearException("Gear must be one of the following: P, R, D, N, 1, 2.");
    }
    this.gear = gear;
  }

  public int getWheelsNumber() {
    return wheels;
  }

  public String getGearNumber() {
    return gear;
  }

  public void setWheels(int wheels) {

    this.wheels = wheels;
  }

  public void setGear(String gear) {
    this.gear = gear;
  }

  public void drive() {
    System.out.println("Going forward");
  }

  public void reverse() {
    System.out.println("Going backwards");
  }
}
