import java.util.Scanner;

class ConditionalCalc {
  public static void main(String[] arg) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double number1 = scanner.nextDouble();
    
    System.out.print("Enter second number: ");
    double number2 = scanner.nextDouble();

    System.out.println("What op do you want to preform ");
    String operation = scanner.nextLine();

    //If else block creates conditionals
    if(operation.equals("sum")) {
      System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
    } else if(operation.equals("sum")) {
      System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
    } else if(operation.equals("mul")) {
      System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
    } else if(operation.equals("div")) {
      if(number2 == 0) {
        System.out.println("cannot divide by zero");
      } else {
        System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
      }
    } else {
      System.out.printf("%s is not a supported operation", operation);
    }

    scanner.close();
  }
}
