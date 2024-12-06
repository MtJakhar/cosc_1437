package AssignmentReviews.Assignment7nUp;
/*
 * a super class reference variable can reference objects of a subclass
 */

import java.util.ArrayList;

public class Polymorphism {
  public static void main(String[] args) {
    // this is example of polymorphism
    // a super class variable is referencing a subclass object
    Character newEntity = new Player(150, 10, 16, 14, 10, 10, 14, "elf", "elfina", 23, "rogue");
    Character goblinOne = new Character();
    Character goblinTwo = new Character();
    Character OrcOne = new Character();
    Player Hero = new Player(200, 18, 14, 16, 10, 10, 12, "human", "Esfandiyar", 22, "fighter");

    // this array list is also an example of polymorhpism as even though it is a
    // Character based array, it can still reference the character subclasses like
    // player.
    ArrayList<Character> turnOrder = new ArrayList<Character>();

    turnOrder.add(goblinOne);
    turnOrder.add(newEntity);
    turnOrder.add(goblinTwo);
    turnOrder.add(Hero);
    turnOrder.add(OrcOne);

    // When executing the attack method the Java VM is using dynamic binding to
    // determine whether it must use the superclass's attack method or the
    // subclasses attack method.
    for (Character entity : turnOrder) {
      entity.Attack();
    }

  }
}
