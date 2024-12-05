
public class Rectangle {
  /*
   * An object is a software that is in memory and has a specific task
   * objects is created from a class, which has the blueprints describing an
   * object
   * 
   * data stored in objects are called fields
   * objects can do actions which is what we call methods
   */

  // class fields, or the data that its holds
  // has access specifier of private meaning it will not be accessed outside of
  // class
  private double length;
  private double width;

  // has static keyword cause this method can only be used in this class
  // usually classes dont have main in them
  public static void main(String[] args) {

  }

  // this is a constructor it is a unique method that is used when a class is
  // created. it is called when and instance of a class is created.
  // if a constructor is not creaetd a default constructor is used and sets to
  // zero or false if a bool
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // if you create a constuctor and you want the option of providing no arguments
  // you must also creat your own custom, default no-args constructor, this is
  // also an example of overloading as constructors are also methods
  public Rectangle() {
    this.length = 0;
    this.width = 0;
  }

  // no static so it can used by this class's children, because of public
  public void setLength(double length) {
    this.length = length;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return this.length;
  }

  public double getWidth() {
    return this.width;
  }

  public double getArea() {
    return this.width * this.length;
  }

  /*
   * You can also OVERLOAD methods meaning you can create mutliple methods of the
   * same name so that they can take in different parameters,
   */

  public int add(int num1, int num2) {
    return num1 + num2;
  }

  public double add(double num1, double num2) {
    return num1 + num2;
  }
}
