import java.util.Scanner;

public class Test{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter an integer");
    int number = keyboard.nextInt();

    System.out.println("The number you entered is: " + number);

    keyboard.nextLine();

    System.out.println("Enter a number between 1-10");
    int numberOneThroughTen = keyboard.nextInt();
    
    if(numberOneThroughTen >= 1 && numberOneThroughTen <=10) {
      System.out.println("yes, you have done it right");
    } else if(numberOneThroughTen > 100) {
      System.out.println("That is way too big!!");
    } else {
      System.out.println("not between 1-10");
    }
    keyboard.nextLine();

    System.out.println("enter yes");
    String yesOrNo = keyboard.nextLine();
    //must use the method .equals() from string object
    if(yesOrNo.equals("yes")) {
      System.out.println("It works");
    } else {
      System.out.println("no not working");
    }

    System.out.println(yesOrNo.charAt(0));

    System.out.println("Enter a integer (1-7) or not.");
    int numberTwo = keyboard.nextInt();

    switch(numberTwo) {
      case 1:
      case 2:
      case 3:
      case 4:
      System.out.println("1234");
      break;
      case 5,6,7: 
      System.out.println("5,6,7");
      break;
      default: 
      System.out.println("unexpected String");
      break;
    }
  }
}
