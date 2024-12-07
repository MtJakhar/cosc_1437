import java.util.Scanner;

public class Tester {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      Semi truck = new Semi();
      Motorcycle cycle = new Motorcycle();
      Car weirdCar = new Car('P', 3);
      // Semi weirdTruck = new Semi('Z', 16);

      cycle.drive();
      truck.reverse();
    } catch (CheckGearsException | TwoWheelsException e) {
      System.out.println("Error: " + e.getMessage());
    }

  }
}
