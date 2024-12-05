
import java.util.Scanner;

public class RoomArea {
  public static void main(String[] args) {
    double number;
    double totalArea;

    Scanner scanner = new Scanner(System.in);

    // creating new instance of rectangle class

    Rectangle kitchen = new Rectangle();
    Rectangle bedRoom = new Rectangle();

    // each instance of class has their own instance fields so each instance of
    // rectangle class will have their unique fields
    System.out.println("what kit length?");
    kitchen.setLength(scanner.nextDouble());
    System.out.println("what kit width?");
    kitchen.setWidth(scanner.nextDouble());

    System.out.println("What bed length?");
    bedRoom.setLength(scanner.nextDouble());
    System.out.println("What bed width?");
    bedRoom.setWidth(scanner.nextDouble());

    double kitArea = kitchen.getArea();
    double bedArea = bedRoom.getArea();

    // as seen here each instance has its own data
    System.out.println("Kit Area " + kitArea);
    System.out.println("bed Area " + bedArea);

    getWidthOfRoom(bedRoom);
    getWidthOfRoom(kitchen);

  }

  // you can also pass objects as a arg
  public static void getWidthOfRoom(Rectangle rect) {
    System.out.println("this is the Width of the Room : " + rect.getWidth());
  }
}
