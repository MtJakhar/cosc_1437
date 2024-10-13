//allows user to play a battleship like game, which allows user to make 10 attempts at shooting a ship (which was generated at a random location), and ask them if they would like to restart the game at the end.
// Muizz Jakhar 
// October 11 2024
import java.util.Random;
import java.util.Scanner;

class Assignment4 {
  public static void main(String[] args) {
    //Create a new scanner object to check user input
    Scanner scanner = new Scanner(System.in);
    
    boolean continueGame = true;

    while(continueGame) {

      Ship[] shipArray = createRandomShips();
      

      int attemptCount = 0;
      String userEndInput;
      char doesUserWantToContinue;
      boolean shipHit = false;
      char[][] oceanGrid = new char[10][10];

      for(int row = 0; row < oceanGrid.length; row++){
        for(int column = 0; column < oceanGrid[column].length; column++) {
        }
      }

      
      gameIntro();
      gameInstructions();

      // System.out.printf("\nThe ship is at the following coordinates.\ncolumn: %c\nrow: %d", (char)randomColumn, randomRow);

      //
      while(attemptCount < 10 && shipHit == false) {
        String userInputColumn;
        char userChar;
        int userColumnInt;
        int userInputRow;

        //checks user column input through validation
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

        //increment number of attempts
        attemptCount++;

        //conditional logic for determining whether a ship has been hit or not
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

  //gameInstructions prints game rules to terminal
  public static void gameInstructions() {
    System.out.println("\nInstructions: You are going to be playing a battleship like game.");
    System.out.println("In this game you will enter a column and a row to determine where you will be shooting.");
    System.out.println("Once you enter a column and row, you will be told whether you have hit the ship or not.\n");
    System.out.println("You will be given 10 attempts to hit the ship.");
    System.out.println("Once you have made 10 attempts, you will be given a prompt which will give you the choice to start again");
  }

  //gameIntro prints intro to game on to terminal
  public static void gameIntro() {
    System.out.println("------------------------------------------");
    System.out.println("|--------Welcome to the COSC-1437--------|");
    System.out.println("|-----------Classic Text Based-----------|");
    System.out.println("|----------Naval Combat Game!------------|");
    System.out.println("------------------------------------------");
  }
  //creates 3 random ships
  public static Ship[] createRandomShips() {
    Random randomNumber = new Random();
    Ship[] shipArray = new Ship[3];

    for(int i = 0; i < shipArray.length; i++) {
      int randomColumn = randomNumber.nextInt(10) + 65;
      int randomRow = randomNumber.nextInt(10) + 1;
      int randomSize = randomNumber.nextInt(3) + 3;

      shipArray[i] = new Ship(randomSize, randomColumn, randomRow);
    }
    return shipArray;
  }

  public static void printShipsArrayData(Ship[] shipArray) {
    int count = 1;
    for(Ship ship : shipArray) {
      System.out.printf("Ship %d - size %d, column %c, row %d\n", count, ship.getSize(), (char)ship.getPlacement()[0], ship.getPlacement()[1]);
      count++;
    }
  }
}




