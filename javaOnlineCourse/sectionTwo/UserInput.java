import java.util.Scanner;

class UserInput {
  public static void main(String[] args) {
    //inorder to take input userinput you must use teh scanner class

    //first create object
    Scanner scanner = new Scanner(System.in);

    System.out.print("What is your name? ");
    //this take in next user input line
    String name = scanner.nextLine();

    System.out.printf("Hello %s, How are you?", name);
    
    scanner.close();

  }
}
