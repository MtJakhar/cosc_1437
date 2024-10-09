import java.util.Scanner;

class SwitchStatements {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double number1 = scanner.nextDouble();
    
    System.out.print("Enter second number: ");
    double number2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("What op do you want to preform ");
    String operation = scanner.nextLine();

    //Switch case operation
    switch(operation) {
      case "sum":
        System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
      break;
      case "sub": 
        System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
      break;
      case "mul": 
        System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
      break;
      case "div": 
        if(number2 == 0) {
          System.out.println("cannot divide by zero");
        } else {
          System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
        }
      break;
      default: 
        System.out.printf("%s is not a supported operation", operation);
      break;
    }

    scanner.close();
  }
}
