
public class Semi extends MotorVehicle {
  public Semi() throws CheckGearsException, TwoWheelsException {
    super('P', 16);
  }

  public Semi(char gear, int wheels) throws CheckGearsException, TwoWheelsException {
    super(gear, wheels);
  }
}
