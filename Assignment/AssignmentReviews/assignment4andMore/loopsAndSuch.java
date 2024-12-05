import java.util.Scanner;
import java.util.Random;

public class loopsAndSuch {
  public static void main(String[] args) {
  }

  public void IncrementDecrement() {
    int num = 4;
    System.out.println("number is " + num);
    System.out.println("I will increment number.");

    num++;

    System.out.println("Now, number is " + num);
    System.out.println("I Will decrement num.");

    num--;
    System.out.println("Now, number is " + num);
  }

  // while loop is a pretest loop
  public static void WhileLoop() {
    int number = 1;
    while (number <= 5) {
      System.out.println("Hello");
      number++;
    }
    System.out.println("Thats all folks!");
  }

  public static void InputValidation() {
    int number;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number 1 - 100: ");
    number = scanner.nextInt();

    while (number < 1 || number > 100) {
      System.out.print("Invalid input. Enter a number in the range 1- 100");
      number = scanner.nextInt();
    }
  }

  // is a post test loop that always runs at least once
  public static void doWhile() {
    int score1, score2, score3;
    double average;
    char repeat;
    String input;

    System.out.println("This program calculates teh avg test scores.");

    Scanner keyboard = new Scanner(System.in);

    do {
      System.out.print("Enter score #1: ");
      score1 = keyboard.nextInt();

      System.out.print("Enter score #2: ");
      score2 = keyboard.nextInt();

      System.out.print("Enter score #3: ");
      score3 = keyboard.nextInt();

      keyboard.nextLine();

      average = (score1 + score2 + score3) / 3.0;
      System.out.println("The average is " + average);
      System.out.println();

      System.out.println("Would you like to avg again? Y or N");
      input = keyboard.nextLine();
      repeat = input.charAt(0);
    } while (repeat == 'Y' || repeat == 'y');
  }

  public static void ForLoop() {
    System.out.println("Number Number squared\n");
    int squared;
    for (int i = 1; i < 10; i++) {
      squared = i * i;
      System.out.println(squared);
    }
  }

  public static void userControlledFor() {
    Scanner scanner = new Scanner(System.in);
    int max;
    System.out.println("how many nums should be printed?");
    max = scanner.nextInt();
    scanner.nextLine();

    for (int i = 1; i < max; i++) {
      System.out.println(i);
    }
  }

  public static void sentinels() {
    int points = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("will print what ever number you enter. enter -1 to exit");
    while (points != -1) {
      points = scanner.nextInt();
      System.out.println(points);
    }
    System.out.println("You have exited");
  }

  public static void RandomNumbers() {
    // create Random object
    Random rand = new Random();

    // Get a random number 1-10;
    int randNum10 = rand.nextInt(10) + 1;

    // get -50 - 49
    int randNum49 = rand.nextInt(100) - 50;
  }
}
