package AssignmentReviews.Assignment7nUp;

public class MoreClasses {
  /*
   * static fields and static methods do not belong to any instance of a class,
   * these static fields and methods only belong to the original class
   * 
   * a static field will be stored in memory once and will be shared by all
   * instances of a class.
   */
  private static int instanceCount = 0;
  private int health = 100;
  private int power = 9000;
  // Aggregation is which an instance of a class is a field of another class
  // this String, which is and instance of the String class is a Field of
  // MoreClasses, hence Aggregation
  private String name = "John Smith";

  // note avoid using nulls for fields

  public MoreClasses() {
    instanceCount++;
  }

  public MoreClasses(int health, int power, String name) {
    this.health = health;
    this.power = power;
    this.name = name;
    instanceCount++;
  }

  public int getInstanceCount() {
    return instanceCount;
  }

  /*
   * A static method is created by adding static after teh access specifier in the
   * method header.
   * These static methods can be called without there even being any instances of
   * classes, and will be called in this instance from the MoreClasses class.
   * 
   * A static method can only use static fields and any method called from a
   * static must also be static
   */

  public static double kilometersToMiles(double k) {
    return k / 1.609;
  }

  /*
   * MoreClasses.kilometersToMiles(5)
   * will converr 5 miles to kilometers
   */

  public static double milesToKilometers(double m) {
    return m * 1.609;
  }
  /*
   * MoreClass.milesToKilometers(10)
   * will convert 10 miles to kilometers
   */

  // A toString method returns the fields of a class or a instance of a class
  public String toString() {
    String str = "Health: " + this.health + "\nPower: " + this.power;
    return str;
  }

  // this is an equals method to compare it with more classes of the same parent
  // classs

  public boolean equals(MoreClasses object2) {
    boolean status;
    if (this.health == object2.health && this.power == object2.power) {
      status = true;
    } else {
      status = false;
    }
    return status;
  }

  // copy class create the copy of this class that can be saved to a new variable
  // while not point to the same address, so it wont modify the original
  public MoreClasses copy() {
    MoreClasses copy = new MoreClasses(this.health, this.power, this.name);
    return copy;
  }

  // you can also create a copy constructor which does the same thing but in
  // constructor format
  public MoreClasses(MoreClasses object2) {
    this.health = object2.health;
    this.power = object2.power;
  }
}
