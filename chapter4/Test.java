import java.util.Scanner;
import java.util.Random;

public class Test {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    Random randNumber = new Random();
    int amount = randNumber.nextInt(9) + 1;

    System.out.printf("Enter a Number, this program will increment it by a random amount: ");

    int number = keyboard.nextInt();
    keyboard.nextLine();

    int count = 0;

    while(count < amount) {
      number++;
    }
    System.out.printf("The number you have entered is now equal to %d", number);
  }
}

/*
 * on mid term
 * 
 * calculate how many time this loop execute
 * for(int i = 0; i < 10; i++) {
 * for(int j - 0; j < 10; j+=2){
 * statement
 * }
 * }
 */
