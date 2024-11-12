
//allows user to play a battleship like game, which allows user to make 10 attempts at shooting a ship (which was generated at a random location), and ask them if they would like to restart the game at the end.
// Muizz Jakhar 
// October 11 2024
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Assignment5 {
  public static void main(String[] args) {
    // Create a new scanner object to check user input
    Scanner scanner = new Scanner(System.in);

    boolean continueGame = true;

    while (continueGame) {
      int attemptCount = 0;
      String userEndInput;
      char doesUserWantToContinue;
      char[][] oceanGrid = new char[9][10];

      createOceanGrid(oceanGrid);

      Ship[] shipArray = createRandomShipsOnGrid(oceanGrid);

      gameIntro();
      gameInstructions();

      printOceanGrid(oceanGrid);
      printShipsArrayData(shipArray);

      while (attemptCount < 10 && countOfSunkShips(shipArray) < 3) {
        String userInputColumn;
        char userChar;
        int userColumnCharInt;
        int userInputRow;
        int userColumnForZeroIndex;
        int userInputRowForZeroIndex;

        // checks user column input through validation
        do {
          System.out.println("\n\nPlease enter a column. (Columns are A through J)");
          // first turns user input to uppercase then selects char from string, then
          // coverts char to int, to get unicode position.
          userInputColumn = scanner.nextLine().toUpperCase();
          userChar = userInputColumn.charAt(0);
          userColumnCharInt = (int) userChar;

          // while user input is not equal to a number between 65-74, which are the
          // unicode for A-J
        } while (!(userColumnCharInt >= 65 && userColumnCharInt <= 74));

        // Checks user row input through validation
        do {
          System.out.println("Please enter a row. (Rows are 1-9)");
          userInputRow = scanner.nextInt();
          scanner.nextLine();

          // while user input is not equal to 1-9
        } while (!(userInputRow >= 1 && userInputRow <= 9));

        // convert user inputs to format that can fit into the bounds of the arrays
        userColumnForZeroIndex = userColumnCharInt - 65;
        userInputRowForZeroIndex = userInputRow - 1;

        int[] userInputs = { userColumnForZeroIndex, userInputRowForZeroIndex };

        // increment number of attempts
        attemptCount++;

        // conditional logic for determining whether a ship has been hit or not
        boolean anyHit = false;

        for (int i = 0; i < shipArray.length; i++) {
          boolean hit = false;

          ArrayList<int[]> shipCoordinates = shipArray[i].getShipPositions();

          for (int index = 0; index < shipCoordinates.size(); index++) {
            int[] currentCoordinate = shipCoordinates.get(index);

            if (currentCoordinate[0] == userInputs[0] && currentCoordinate[1] == userInputs[1]) {

              hit = true;
              anyHit = true;

              if (!shipArray[i].getShipSunk()) {
                shipArray[i].setShipSunk();
                System.out.printf("\nHIT!!! You have hit ship %d.\n", i + 1);
                System.out.printf("You have %d attempts left.\n", 10 - attemptCount);
              } else {
                System.out.printf("You have already hit ship %d\n", i + 1);
                System.out.printf("You have %d attempts left.\n", 10 - attemptCount);
              }
              break;
            }
          }
        }

        if (!anyHit) {
          System.out.println("MISS...you have missed the ship");
          System.out.printf("You have %d attempts left.\n", 10 - attemptCount);
        }
      }

      System.out.println("Do you want to restart the game? if yes enter Y, else press any other key");

      userEndInput = scanner.nextLine().toUpperCase();
      doesUserWantToContinue = userEndInput.charAt(0);

      if (doesUserWantToContinue == 'Y') {
        System.out.println("Starting new game...");
      } else {
        continueGame = false;
      }
    }
  }

  // gameInstructions prints game rules to terminal
  public static void gameInstructions() {
    System.out.println("\nInstructions: You are going to be playing a battleship like game.");
    System.out.println("In this game you will enter a column and a row to determine where you will be shooting.");
    System.out.println("Once you enter a column and row, you will be told whether you have hit the ship or not.\n");
    System.out.println("You will be given 10 attempts to hit the ship.");
    System.out.println(
        "Once you have made 10 attempts, you will be given a prompt which will give you the choice to start again");
  }

  // gameIntro prints intro to game on to terminal
  public static void gameIntro() {
    System.out.println("------------------------------------------");
    System.out.println("|--------Welcome to the COSC-1437--------|");
    System.out.println("|-----------Classic Text Based-----------|");
    System.out.println("|----------Naval Combat Game!------------|");
    System.out.println("------------------------------------------");
  }

  // creates 3 random ships
  public static Ship[] createRandomShipsOnGrid(char[][] grid) {
    Random randomNumber = new Random();
    Ship[] shipArray = new Ship[3];
    int shipCount = 0;

    while (shipCount < shipArray.length) {
      boolean isHorizontal = randomNumber.nextInt(2) == 1;
      int randomColumn = randomNumber.nextInt(10);
      int randomRow = randomNumber.nextInt(9);
      int randomSize = randomNumber.nextInt(3) + 3;

      if (shipPlaceable(grid, randomRow, randomColumn, randomSize, isHorizontal)) {
        shipArray[shipCount] = new Ship(randomSize, randomColumn, randomRow, isHorizontal);
        shipCount++;
        for (int i = 0; i < randomSize; i++) {
          if (isHorizontal) {
            grid[randomRow][randomColumn + i] = 'S';
          } else {
            grid[randomRow + i][randomColumn] = 'S';
          }
        }
      }
    }
    return shipArray;
  }

  // counts number of ships currently sunk
  public static int countOfSunkShips(Ship[] shipArray) {
    int count = 0;
    for (int i = 0; i < shipArray.length; i++) {
      if (shipArray[i].getShipSunk()) {
        count++;
      }
    }
    return count;
  }

  // checks to see if ship can be placed
  public static boolean shipPlaceable(char[][] grid, int row, int column, int size, boolean isHorizontal) {
    int columnMax = grid[0].length;
    int rowMax = grid.length;
    if (isHorizontal) {
      if (column + size > columnMax) {
        return false;
      }
      for (int i = 0; i < size; i++) {
        if (grid[row][column + i] != '~') {
          return false;
        }
      }
    } else {
      if (row + size > rowMax) {
        return false;
      }
      for (int i = 0; i < size; i++) {
        if (grid[row + i][column] != '~') {
          return false;
        }
      }
    }
    return true;
  }

  // initializes the grid with ~ chars in ever row and column
  public static void createOceanGrid(char[][] oceanGrid) {
    for (int row = 0; row < oceanGrid.length; row++) {
      for (int column = 0; column < oceanGrid[row].length; column++) {
        oceanGrid[row][column] = '~';
        // System.out.print(" " + oceanGrid[row][column]+ " ");
      }
      // System.out.print("\n");
    }
  }

  // prints the ocean grid to the terminal
  public static void printOceanGrid(char[][] oceanGrid) {
    for (int row = 0; row < oceanGrid.length; row++) {
      for (int column = 0; column < oceanGrid[row].length; column++) {
        System.out.print(" " + oceanGrid[row][column] + " ");
      }
      System.out.print("\n");
    }
  }

  // prints initial coordinates of ships
  public static void printShipsArrayData(Ship[] shipArray) {
    int count = 1;
    for (Ship ship : shipArray) {
      System.out.printf("Ship %d - size %d, column %c, row %d\n", count, ship.getSize(),
          (char) ship.getPlacement()[0] + 65, ship.getPlacement()[1] + 1);
      count++;
    }
  }
}
