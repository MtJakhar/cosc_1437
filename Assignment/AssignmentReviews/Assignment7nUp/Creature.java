package AssignmentReviews.Assignment7nUp;

//interface is like a class that only contains abstract methods
//methods in interfaces have no bodies, only headers ended by semicolons
public interface Creature {
  // interface can contain field declarations, but all fields in an interface are
  // treated as final and static. static meaning that it will be shared to all
  // instance of the interface, and final meaning that they cannot be change once
  // they are declared.

  String alignment = "Hostile";

  public void intimidate();

  public default void checkSurroundings() {
    System.out.println("Creature has checked surrounding for enemies. Enemy Found!!!");
  }

  public void callReinforcements();
}
