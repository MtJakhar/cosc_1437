package MagicalMountsAdventure;

public class Tester {
  public static void main(String[] args) {
    try {
      Dragon drogon = new Dragon(50, 1);
      drogon.attack();
      drogon.defend();

      GiantSpider spider = new GiantSpider();
      spider.attack();
      spider.defend();

      Horse roach = new Horse(60, 4);
      roach.moveForward();
      roach.moveBackward();

      roach.changeSpeed(-10);

    } catch (InvalidSpeedException | InvalidLegCountException e) {
      System.out.println(e.getMessage());
    }
  }
}
