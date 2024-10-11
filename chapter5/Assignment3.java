import java.util.Scanner;
import java.util.Random;

//allows user to play a battleship like game, which allows user to make 10 attempts at shooting a ship (which was generated at a random location), and ask them if they would like to restart the game at the end.
// Muizz Jakhar 
// September 30 2024

public class Assignment3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    boolean continueGame = true;

    while(continueGame) {
      //output from Assignment 1
      System.out.println("------------------------------------------");
      System.out.println("|--------Welcome to the COSC-1437--------|");
      System.out.println("|-----------Classic Text Based-----------|");
      System.out.println("|----------Naval Combat Game!------------|");
      System.out.println("------------------------------------------");

      //Game instructions
      System.out.println("\nInstructions: You are going to be playing a battleship like game.");
      System.out.println("In this game you will enter a column and a row to determine where you will be shooting.");
      System.out.println("Once you enter a column and row, you will be told whether you have hit the ship or not.\n");
      System.out.println("You will be given 10 attempts to hit the ship.");
      System.out.println("Once you have made 10 attempts, you will be given a prompt which will give you the choice to start again");

      //declaring variables which will be needed
      int attemptCount = 0;
      boolean shipHit = false;
      String userEndInput;
      char doesUserWantToContinue;
    
      //creates a random row and col number. (The column number is based on unicode)
      Random randomNumbers = new Random();
      int randRow = randomNumbers.nextInt(9) + 1;
      int randCol = randomNumbers.nextInt(10) + 65;
  
  
      //Prints the ships coordinates so you can hit it. Uncomment to show in terminal.
      System.out.printf("\nThe ship is at the following coordinates.\ncolumn: %c\nrow: %d", (char)randCol, randRow);
  
      while(attemptCount < 10  && shipHit == false) {
        //local variables
        String userInputColumn;
        char userChar;
        int userColumnInt;
        int userInputRow;
        //Checks user column input through validation
        do {
          System.out.println("\n\nPlease enter a column. (Columns are A through J)");
          //first turns user input to uppercase then selects char from string, then coverts char to int, to get unicode position.
          userInputColumn = keyboard.nextLine().toUpperCase();
          userChar = userInputColumn.charAt(0);
          userColumnInt = (int)userChar;
  
          //while user input is not equal to a number between 65-74, which are the unicode for A-J
        } while(!(userColumnInt >= 65 && userColumnInt <= 74));
  
        //Checks user row input through validation
        do {
          System.out.println("Please enter a row. (Rows are 1-9)");
          userInputRow = keyboard.nextInt();
          keyboard.nextLine();
  
          //while user input is not equal to 1-9
        } while(!(userInputRow >= 1 && userInputRow <= 9));

        //attemptCount increment
        attemptCount++;
  
        if(randRow == userInputRow && randCol == userColumnInt) {
          System.out.println("\nHIT!!! You have hit the ship");
          shipHit = true;
        } else {
          System.out.println("MISS... You have missed the ship");
          System.out.printf("You have %d attempts left.\n", 10 - attemptCount);
        }
      }

      System.out.println("Do you want to restart the game? if yes enter Y, else press any other key");
      
      userEndInput = keyboard.nextLine().toUpperCase();
      doesUserWantToContinue = userEndInput.charAt(0);
      if(doesUserWantToContinue == 'Y') {
        System.out.println("Starting new game...");
      } else {
        continueGame = false;
      }
    }
  }
}
