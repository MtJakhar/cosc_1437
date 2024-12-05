import java.util.Scanner;

public class HowToScanner {
  public static void main(String[] args) {
    /*
     * Scanner reads and writes keyboard input
     * 
     * first you create a scnner and connect it to the System.in object
     */

    Scanner keyboard = new Scanner(System.in);
    String name;
    System.out.println("Enter your name: ");
    name = keyboard.nextLine();

    System.out.print("Enter your age: ");
    int age = keyboard.nextInt();

    System.out.println("Enter your favorite number");
    double favoriteNumber = keyboard.nextDouble();

    System.out.println("\nThank you, " + name + "!");
    System.out.println("You are " + age + " years old.");
    System.out.println("Your favorite number is " + favoriteNumber + ".");

  }
}
