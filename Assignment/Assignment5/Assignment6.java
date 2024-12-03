import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Assignment6 {
  public static void main(String[] args) {
    // Create a scanner object to capture user input
    Scanner scanner = new Scanner(System.in);

    boolean continueGame = true;

    while (continueGame) {
      int attemptCount = 0;
      String userEndInput;
      char doesUserWantToContinue;
      char[][] oceanGrid = new char[9][10];

      createOceanGrid(oceanGrid);
      Ship[] shipArray = createShipsOnGrid(oceanGrid);

      gameIntro();
      gameInstructions();

      printOceanGrid(oceanGrid);
      printShipsArrayData(shipArray);

      while (attemptCount < 10 && countOfSunkShips(shipArray) < 5) {
        try {
          // Get user input for column and row
          int[] userInputs = getUserInputs(scanner);

          // Handle the user's attempt and process any exceptions
          handleHitAttempt(userInputs, shipArray, attemptCount);
          attemptCount++;

        } catch (MultipleHitException e) {
          System.out.println(e.getMessage());
        }
      }

      System.out.println("Do you want to restart the game? If yes, enter Y. Otherwise, press any other key.");
      userEndInput = scanner.nextLine().toUpperCase();
      doesUserWantToContinue = userEndInput.charAt(0);

      if (doesUserWantToContinue == 'Y') {
        System.out.println("Starting new game...");
      } else {
        continueGame = false;
      }
    }

    scanner.close();
  }

  // Handles user attempts to hit a ship
  public static void handleHitAttempt(int[] userInputs, Ship[] shipArray, int attemptCount)
      throws MultipleHitException {
    boolean anyHit = false;

    for (int i = 0; i < shipArray.length; i++) {
      ArrayList<int[]> shipCoordinates = shipArray[i].getShipPositions();

      for (int[] coordinate : shipCoordinates) {
        if (coordinate[0] == userInputs[0] && coordinate[1] == userInputs[1]) {
          anyHit = true;

          if (!shipArray[i].getShipSunk()) {
            shipArray[i].setShipSunk();
            System.out.printf("\nHIT!!! You have hit ship %d.\n", i + 1);
          } else {
            throw new MultipleHitException();
          }
          break;
        }
      }
    }

    if (!anyHit) {
      System.out.println("MISS...you have missed the ship.");
    }
    System.out.printf("You have %d attempts left.\n", 10 - attemptCount);
  }

  // Get validated user inputs for column and row
  public static int[] getUserInputs(Scanner scanner) {
    int userColumnForZeroIndex;
    int userInputRowForZeroIndex;

    // Validate column input
    do {
      System.out.println("\nEnter a column (A-J):");
      char columnChar = scanner.nextLine().toUpperCase().charAt(0);
      userColumnForZeroIndex = columnChar - 'A';
    } while (userColumnForZeroIndex < 0 || userColumnForZeroIndex >= 10);

    // Validate row input
    do {
      System.out.println("Enter a row (1-9):");
      userInputRowForZeroIndex = scanner.nextInt() - 1;
      scanner.nextLine(); // Consume newline
    } while (userInputRowForZeroIndex < 0 || userInputRowForZeroIndex >= 9);

    return new int[] { userColumnForZeroIndex, userInputRowForZeroIndex };
  }

  // Print game instructions
  public static void gameInstructions() {
    System.out.println("\nInstructions: You are going to play a battleship-like game.");
    System.out.println("Enter a column and a row to determine where you will be shooting.");
    System.out.println("You will be told whether you have hit the ship or not.");
    System.out.println("You have 10 attempts to hit all the ships. Good luck!\n");
  }

  // Print game intro
  public static void gameIntro() {
    System.out.println("------------------------------------------");
    System.out.println("|--------Welcome to the COSC-1437--------|");
    System.out.println("|-----------Classic Text Based-----------|");
    System.out.println("|----------Naval Combat Game!------------|");
    System.out.println("------------------------------------------");
  }

  // Create the ships and place them randomly on the grid
  public static Ship[] createShipsOnGrid(char[][] grid) {
    Random randomNumber = new Random();
    Ship[] shipArray = new Ship[5];

    for (int i = 0; i < shipArray.length; i++) {
      boolean placed = false;
      while (!placed) {
        boolean isHorizontal = randomNumber.nextBoolean();
        int randomColumn = randomNumber.nextInt(10);
        int randomRow = randomNumber.nextInt(9);

        Ship navalVessel;
        switch (i) {
          case 0:
            navalVessel = new AircraftCarrier(randomColumn, randomRow, isHorizontal);
            break;
          case 1:
            navalVessel = new Battleship(randomColumn, randomRow, isHorizontal);
            break;
          case 2:
            navalVessel = new Cruiser(randomColumn, randomRow, isHorizontal);
            break;
          case 3:
            navalVessel = new Submarine(randomColumn, randomRow, isHorizontal);
            break;
          case 4:
            navalVessel = new Destroyer(randomColumn, randomRow, isHorizontal);
            break;
          default:
            navalVessel = null;
        }

        if (navalVessel != null && shipPlaceable(grid, navalVessel.getPlacement()[1], navalVessel.getPlacement()[0],
            navalVessel.getSize(), isHorizontal)) {
          shipArray[i] = navalVessel;

          for (int j = 0; j < navalVessel.getSize(); j++) {
            if (isHorizontal) {
              grid[randomRow][randomColumn + j] = 'S';
            } else {
              grid[randomRow + j][randomColumn] = 'S';
            }
          }
          placed = true;
        }
      }
    }

    return shipArray;
  }

  // Check if a ship can be placed at a specific location
  public static boolean shipPlaceable(char[][] grid, int row, int column, int size, boolean isHorizontal) {
    int columnMax = grid[0].length;
    int rowMax = grid.length;

    if (isHorizontal) {
      if (column + size > columnMax)
        return false;
      for (int i = 0; i < size; i++) {
        if (grid[row][column + i] != '~')
          return false;
      }
    } else {
      if (row + size > rowMax)
        return false;
      for (int i = 0; i < size; i++) {
        if (grid[row + i][column] != '~')
          return false;
      }
    }
    return true;
  }

  // Create the ocean grid with ~ for all cells
  public static void createOceanGrid(char[][] oceanGrid) {
    for (int row = 0; row < oceanGrid.length; row++) {
      for (int column = 0; column < oceanGrid[row].length; column++) {
        oceanGrid[row][column] = '~';
      }
    }
  }

  // Count the number of sunk ships
  public static int countOfSunkShips(Ship[] shipArray) {
    int count = 0;
    for (Ship ship : shipArray) {
      if (ship.getShipSunk()) {
        count++;
      }
    }
    return count;
  }

  // Print the ocean grid
  public static void printOceanGrid(char[][] oceanGrid) {
    for (int row = 0; row < oceanGrid.length; row++) {
      for (int column = 0; column < oceanGrid[row].length; column++) {
        System.out.print(" " + oceanGrid[row][column] + " ");
      }
      System.out.println();
    }
  }

  // Print the ships' data
  public static void printShipsArrayData(Ship[] shipArray) {
    int count = 1;
    for (Ship ship : shipArray) {
      System.out.printf("Ship %d - size %d, column %c, row %d\n", count, ship.getSize(),
          (char) ship.getPlacement()[0] + 65, ship.getPlacement()[1] + 1);
      count++;
    }
  }
}
