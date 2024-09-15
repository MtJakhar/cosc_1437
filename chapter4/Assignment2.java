// package chapter4;
import java.util.Scanner;
import java.util.Random;

// a program which prints game directions and allows user to play a battleship like game
// Muizz Jakhar 
// September 15 2024

public class Assignment2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    //creates a random row and col number. (The column number is based on unicode)
    Random randomNumbers = new Random();
    int randRow = randomNumbers.nextInt(9) + 1;
    int randCol = randomNumbers.nextInt(10) + 65;
    
    //declaring variables which will be needed
    String userInputColumn;
    char userChar;
    int userColumnInt;
    int userInputRow;

    //output from Assignment 1
    System.out.println("------------------------------------------");
    System.out.println("|--------Welcome to the COSC-1437--------|");
    System.out.println("|-----------Classic Text Based-----------|");
    System.out.println("|----------Naval Combat Game!------------|");
    System.out.println("------------------------------------------");

    //Game instructions
    System.out.println("\nInstructions: You are going to be playing a battleship like game.");
    System.out.println("In this game you will enter a column and a row to determine where you will be shooting.");
    System.out.println("Once you enter a column and row, you will be shown a Grid.\n");
    System.out.println("This grid will be the following symbols:\n~ - represent the waves\nX- will represent you missed shot\nS- will show the Ships position\nO- will be shown if you hit the ship");


    //Prints the ships coordinates so you can hit it. Uncomment to show in terminal.
    // System.out.printf("\nThe ship is at the following coordinates.\nrow: %d\ncolumn:%c", randRow, (char)randCol);

    
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

      //while user input is not equal to 1-9
    } while(!(userInputRow >= 1 && userInputRow <= 9));


    if(randRow == userInputRow && randCol == userColumnInt) {
      System.out.println("\nHIT!!! You have hit the ship");
    } else {
      System.out.println("MISS... You have missed the ship");
    }

    System.out.println("Look at the below grid to see your results:\n");

    //creates a grid which shows results of game by depicting the position of ship, user shot, and if user hit the ship; in a grid format. 
    for(int row = 1; row <= 9; row++) {
      //second loop is going through the unicode value of A-J
      for(int col = 65; col <= 74; col++) {
        //checks to see if current row/column is where the ship is
        if(row == randRow && col == randCol) {
          //checks to see if current colum is where the user coordinates are.
          if(row == userInputRow && col == userColumnInt) {
            //print ship hit symbol
            System.out.print(" O ");
          } else {
            //print ship symbol
            System.out.print(" S ");
          }
        } else {
          //checks if user coordinates are here if yes, print miss
          if(row == userInputRow && col == userColumnInt) {
            //print missed shot symbol
            System.out.print(" X ");
          } else {
            //print wave
            System.out.print(" ~ ");
          }
        }
      }
      System.out.println();
    }
  }
}


