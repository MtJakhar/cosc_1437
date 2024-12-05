import java.util.Scanner;

public class CheckTemperature {
  public static void main(String[] args) {
    final double MAX_TEMP = 102.5;
    double temperature;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the substance Celsius temp: ");
    temperature = scanner.nextDouble();

    while (temperature > MAX_TEMP) {
      System.out.println(
          "The temp is too high. Turn the thermo down and wait 5 mins.\nThen take the temp again.\n and enter it here: ");
      temperature = scanner.nextDouble();
    }

    System.out.println("The temp is acceptable");
  }
}
