//allows user to play a battleship like game, which allows user to make 10 attempts at shooting a ship (which was generated at a random location), and ask them if they would like to restart the game at the end.
// Muizz Jakhar 
// October 11 2024
import java.util.Random;
import java.util.Scanner;

class Assignment4 {
  public static void main(String[] args) {
    //Create a new scanner object to check user input
    Scanner scanner = new Scanner(System.in);
    Random randomNumber = new Random();

    boolean continueGame = true;

    while(continueGame) {
      int randomColumn = randomNumber.nextInt(10) + 1;
      int randomRow = randomNumber.nextInt(10) + 65;
  
      int attemptCount = 0;
      String userEndInput;
      char doesUserWantToContinue;
      boolean shipHit = false;
      int shipArray[][]; 
      
      gameIntro();
      gameInstructions();


      System.out.printf("\nThe ship is at the following coordinates.\ncolumn: %c\nrow: %d", (char)randomColumn, randomRow);

      while(attemptCount < 10 && shipHit == false) {
        String userInputColumn;
        char userChar;
        int userColumnInt;
        int userInputRow;

        do {
          System.out.println("\n\nPlease enter a column. (Columns are A through J)");
          //first turns user input to uppercase then selects char from string, then coverts char to int, to get unicode position.
          userInputColumn = scanner.nextLine().toUpperCase();
          userChar = userInputColumn.charAt(0);
          userColumnInt = (int)userChar;

          //while user input is not equal to a number between 65-74, which are the unicode for A-J
        } while(!(userColumnInt >= 65 && userColumnInt <= 74));

        //Checks user row input through validation
        do {
          System.out.println("Please enter a row. (Rows are 1-9)");
          userInputRow = scanner.nextInt();
          scanner.nextLine();

          //while user input is not equal to 1-9
        } while(!(userInputRow >= 1 && userInputRow <= 9));

        attemptCount++;

        if(randomRow == userInputRow && randomColumn == userColumnInt) {
          System.out.println("\nHIT!!! You have hit the ship");
          shipHit = true;
        } else {
          System.out.println("MISS... You have missed the ship");
          System.out.printf("You have %d attempts left.\n", 10 - attemptCount);
        }
      }

      System.out.println("Do you want to restart the game? if yes enter Y, else press any other key");
      
      userEndInput = scanner.nextLine().toUpperCase();
      doesUserWantToContinue = userEndInput.charAt(0);
      if(doesUserWantToContinue == 'Y') {
        System.out.println("Starting new game...");
      } else {
        continueGame = false;
      }

    }
  }

  public static void gameInstructions() {
    System.out.println("\nInstructions: You are going to be playing a battleship like game.");
    System.out.println("In this game you will enter a column and a row to determine where you will be shooting.");
    System.out.println("Once you enter a column and row, you will be told whether you have hit the ship or not.\n");
    System.out.println("You will be given 10 attempts to hit the ship.");
    System.out.println("Once you have made 10 attempts, you will be given a prompt which will give you the choice to start again");
  }

  public static void gameIntro() {
    System.out.println("------------------------------------------");
    System.out.println("|--------Welcome to the COSC-1437--------|");
    System.out.println("|-----------Classic Text Based-----------|");
    System.out.println("|----------Naval Combat Game!------------|");
    System.out.println("------------------------------------------");
  }
}
