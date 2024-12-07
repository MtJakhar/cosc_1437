package AssignmentReviews.Assignment7nUp;

/*
 * what is inheritance
 * allows a new class to extend an existing class, taking its main attrubutes, fields, aND ETC.
 * see player  class
 */

//an abstract class can not be created, it serves as a blueprint to other classes, and only abstract classes can have abstract methods.

//public abstract class Character {}

//final class cannot be inherited from
//public final class Character
public class Character {
  private int health;
  private int strength;
  private int dexterity;
  private int constitution;
  private int intelligence;
  private int wisdom;
  private int charisma;

  public Character() {
    this.health = 100;
    this.strength = 10;
    this.dexterity = 10;
    this.constitution = 10;
    this.intelligence = 10;
    this.wisdom = 10;
    this.charisma = 10;
  }

  public Character(int health, int strength, int dexterity, int constitution, int intelligence, int wisdom,
      int charisma) {
    this.health = health;
    this.strength = strength;
    this.dexterity = dexterity;
    this.constitution = constitution;
    this.intelligence = intelligence;
    this.wisdom = wisdom;
    this.charisma = charisma;
  }

  // setters
  public void setHealth(int health) {
    this.health = health;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public void setDexterity(int dexterity) {
    this.dexterity = dexterity;
  }

  public void setConstitution(int constitution) {
    this.constitution = constitution;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public void setWisdom(int wisdom) {
    this.wisdom = wisdom;
  }

  public void setCharisma(int charisma) {
    this.charisma = charisma;
  }

  // getters
  public int getHealth() {
    return health;
  }

  public int getStrength() {
    return strength;
  }

  public int getDexterity() {
    return dexterity;
  }

  public int getConstitution() {
    return constitution;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public int getWisdom() {
    return wisdom;
  }

  public int getCharisma() {
    return charisma;
  }

  // methods
  public void Attack() {
    System.out.println("A NPC Attacks!");
  }

  // abstract method -a method that appears in a superclass that is to be
  // overidden. Also can be created in abstract classes, which are classes which
  // cannot be created but provided a blue print for subclasses
  // public abstract void sayHello();

  // final method- cannot be overriden
  // public final void message() {
  // System.out.println("A message has been sent");
  // }

}
