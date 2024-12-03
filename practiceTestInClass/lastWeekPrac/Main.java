package lastWeekPrac;

public class Main {
  public static void main(String[] args) {
    try {
      MotorBike motorbike = new MotorBike();
      motorbike.drive();
      motorbike.reverse();
      motorbike.setWheels(1); // This will throw InvalidWheelsException
    } catch (NeedMoreWheels e) {
      System.out.println(e.getMessage());
    }

    try {
      Car car = new Car();
      car.setGear("X"); // This will throw InvalidGearException
    } catch (InvalidGearException e) {
      System.out.println(e.getMessage());
    }

    Semi semi = new Semi();
    semi.drive();
  }
}