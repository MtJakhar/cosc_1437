
public class Motorcycle extends MotorVehicle {
  public Motorcycle() {
    super();
  }

  public Motorcycle(char gear) throws CheckGearsException, TwoWheelsException {
    super(gear, 2);
  }
}
