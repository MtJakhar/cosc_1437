import java.util.Scanner;

class UserInput {
  public static void main(String[] args) {
    //inorder to take input userinput you must use teh scanner class

    //first create object
    Scanner scanner = new Scanner(System.in);

    System.out.print("What is your name? ");
    //this take in next user input line
    String name = scanner.nextLine();

    System.out.printf("Hello %s, How hold are you?", name);
    int age = scanner.nextInt();

    System.out.printf("%d is a good age to start programming, what lang you prefer", age);

    //After a nextInt, nextFloat etc, when followed by nextLine()
    //you should do the following, it will fix the problem
    scanner.nextLine();

    String lang = scanner.nextLine();
    System.out.printf("%s is a great language", lang);



    scanner.close();

  }
}
