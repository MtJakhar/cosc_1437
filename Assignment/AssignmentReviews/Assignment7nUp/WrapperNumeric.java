package AssignmentReviews.Assignment7nUp;

import java.util.ArrayList;

public class WrapperNumeric {
  /*
   * All numeric wrapper classes
   * Byte - byte
   * Double - double
   * Float - float
   * Integer - int
   * Long - long
   * Short - short
   * each of these have a toString method
   */

  public static void main() {
    int i = 12;
    double d = 14.95;
    // toString returns string version of number
    String str1 = Integer.toString(i);
    String str2 = Double.toString(d);

    // parse methods turn strings to byte,int,double versions of the number
    int num = Integer.parseInt("2");
    double num2 = Double.parseDouble("2.0");
    byte num3 = Byte.parseByte("1");

    // autoboxing is to put a value inside an wrapper object, and attached the
    // addres of the object to a variable
    Integer number = 7;

    // unboxing conversts wrapper version of number to primitive type,
    Integer myInt = 5; // autobox 5 to Integer myint
    int primitiveNum = myInt; // unboxes the object to the prim datatype.

    //the main reason to use these wrapper classes is to store these primitve datatype into ArrayLists, ArrayList hold only objects, so to hold other datatypes just use the Wrapper class version so that you can store these datatypes in the ArrayList class


    //as you can see Arraylist wont take the int datatype
    ArrayList <int> oldList = new ArrayList<int>();

    ArrayList <Integer> list = new ArrayList<Integer>();
    Integer myInt = 5;
    //as you can see you can now add both the int via The Integer class, and as a primitive int, because adding the primitive will be "unboxed as explained above"
    list.add(myInt);
    list.add(5);
  }

}
