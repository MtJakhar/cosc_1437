package chapter7;
import java.io.*;
import java.util.Scanner;

public class fileManagement {
  public static void main(String [] args) throws IOException {
    
  }
  public static void processFile(String inputFile, String outputFile) throws IOException {
    File input = new File(inputFile);
    File output = new File(outputFile);

    try (Scanner scanner = new Scanner(input); PrintWriter writer = new PrintWriter(output)) {
        //Please insert your code here.
        while(scanner.hasNext()){
            int number = scanner.nextInt();
            int square = number * number;
            writer.printf("The square of %d is %d.%n", number, square);
        }
    }
    catch (Exception e) {
        System.err.println("Error processing file: " + e.getMessage());
    }
}
}
