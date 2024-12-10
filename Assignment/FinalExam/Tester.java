
public class Tester {
  public static void main(String[] args) {
    Alien alienOne = new Alien(3);
    Alien alienTwo = new Alien(5);
    RattlesnakeAlien alienSnake = new RattlesnakeAlien(10, "HISS");

    Alien[] arrayOfAliens = { alienOne, alienTwo, alienSnake };

    for (Alien memberAlien : arrayOfAliens) {
      System.out.println(memberAlien.toString());
    }
    try {
      Alien newAlien = new Alien();
    } catch (NoDamage e) {
      System.out.println(e.getMessage());
    }
  }

}
