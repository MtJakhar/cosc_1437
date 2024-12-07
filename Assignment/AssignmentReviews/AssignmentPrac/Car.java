
public class Car extends MotorVehicle {
  public Car() throws CheckGearsException, TwoWheelsException {
    super('P', 4);
  }

  public Car(char gear, int wheels) throws CheckGearsException, TwoWheelsException {
    super(gear, wheels);
  }
}
