public class Variable {
  // variables are a named storage location in memory
  // literal means value in programming
  public static void main(String[] args) {
    int value;
    value = 5;
    System.out.print("The value is ");
    System.out.println(value);

    // display with string concatenation
    System.out.println("This is" + " one string");
    System.out.println("the value is " + value);

    // example of primitive datatypes
    byte myByte = 127;
    short myShort = 32767;
    int myInt = 2147483647;
    long myLong = 1000000000;
    float myFloat;
    double myDouble = 32.2;
    // they are primitive since you can not create objects from them, they do not
    // have fields or methods.
  }

  public void returnNumbers() {
    int number = 3;
    double numberDecimal = 3.3;

    System.out.println("Here are some numbers: " + number + " " + numberDecimal);
  }

  public void booleanDataTypes() {
    // boolean variables hold true or false values;
    boolean bool;
    bool = true;
    System.out.println("This is " + bool);
    bool = false;
    System.out.println("This is " + bool);
  }

  public void charDataTypes() {
    // a character that is stored in a single ''
    char letter;
    letter = 'a';
    System.out.println("this is a letter " + letter);
    letter = 'b';
    System.out.println("this is a letter " + letter);
    letter = 65;
    System.out.println("This is also a letter " + letter);
  }
}
