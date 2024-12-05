package AssignmentReviews.Assignment7nUp;

import java.util.Scanner;

public class IntroArrays {

  // arrays can hold multiple value of the same data type, it is considered and
  // object. once an array is created its size cannot be changed

  public static void main(String[] args) {
    // number in [] is a size declarator it creates and array of that size
    int[] num = new int[6];
    char[] letters = new char[26];
    long[] units = new long[10];
    double[] sizes = new double[15];
    // arrays element count or subscript start at zero

    final int employees = 3;
    int[] hours = new int[employees];

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the hours worked by " + employees + " employees.");
    // note that the array object has a length field
    for (int i = 0; i < hours.length; i++) {
      System.out.printf("Employee %d: ", i + 1);
      hours[i] = scanner.nextInt();
    }

    // Display the values entered
    System.out.println("The hours you entered are: ");
    System.out.println(hours[0] + "\n" + hours[1] + "\n" + hours[2]);

    // use can also initialize an array with values

    int[] days = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for (int i = 0; i < days.length; i++) {
      System.out.printf("Month %d has %d days\n", i + 1, days[i]);
    }
    int[] firstArray = { 1, 2, 3, 4, 5 };
    int[] copyArray = copyArray(firstArray);

    // paritally filled arrays
    final int arraySize = 100;
    int[] array = new int[arraySize];
    int count = 0;

    System.out.print("enter a number of -1 to quit: ");
    int number = scanner.nextInt();
    while (number != -1 && count < array.length) {
      array[count] = number;
      count++;
      System.out.print("enter a number of -1 to quit: ");
      number = scanner.nextInt();
    }

    // array of strings, since strings are objects then you can make an array of any
    // object such as the Rectangle object example: Rectangle [] = new Rectangle[5];

    String[] months = {
        "January", "February", "March", "April",
        "May", "June", "July", "August",
        "September", "October", "November", "December"
    };

    int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    for (int i = 0; i < months.length; i++) {
      System.out.printf("%s has %d days.\n", months[i], daysInMonth[i]);
    }

    /*
     * two dimensional arrays
     * formatted as rows and col
     * 
     * in the example below, 3 is rows and 4 is cols
     * [,,,],
     * [,,,],
     * [,,,]
     */
    double[][] scores = new double[3][4];
    // when initialized
    int[][] twoDarray = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 }
    };

    // how to loop through a 2d array
    int total = 0;
    for (int row = 0; row < twoDarray.length; row++) {
      for (int col = 0; col < twoDarray[row].length; col++) {
        System.out.println(twoDarray[row][col]);
        total += twoDarray[row][col];
      }
    }

    System.out.println("total of teh 2d array " + total);
  }

  // inorder to copy an array you must create a new array and copy the elements of
  // the old array to the new. You can not just equate the array to the old
  // variable, as the old variable references the arrays address, and does not
  // give you the actual array.
  public static int[] copyArray(int[] array) {
    int[] newArray = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }

    return newArray;
  }

  /*
   * like above you can not compare two arrays using the == operators
   * as the operators will just compare the address of the arrays
   * to compare arrays you must do the following
   */

  public static boolean arraysEqual(int[] array1, int[] array2) {
    boolean arraysEqual = true;
    int index = 0;
    if (array1.length != array2.length) {
      arraysEqual = false;
    }
    while (arraysEqual && index < array1.length) {
      if (array1[index] != array2[index]) {
        arraysEqual = false;
      }
      index++;
    }

    return arraysEqual;
  }

  // a method with a variable length of arguments
  public static int sum(int... numbers) {
    int total = 0;
    for (int val : numbers) {
      total += val;
    }
    return total;
  }

}
