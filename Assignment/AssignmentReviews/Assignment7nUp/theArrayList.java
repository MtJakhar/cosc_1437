package AssignmentReviews.Assignment7nUp;

import java.util.ArrayList;

public class theArrayList {
  /*
   * and arrayList is an object that works similiar to an array but you can change
   * its size
   */
  public static void main(String[] args) {
    // how to create an arrayList 3 ways
    ArrayList<String> nameList = new ArrayList<String>();

    // second way
    // also note that the ArrayList size default to 10, by adding 20, we change its
    // initial capacity to 20, but the size can be increase or decreased without
    // declaring a capacity
    ArrayList<Integer> numberList = new ArrayList<>(20);

    // third way
    var doubleList = new ArrayList<Double>();

    // note that the arrayList dont take int, double, but rather the Wrapper class
    // version of those datatypes.

    // similar to array creation as we are creating objects from classes
    int[] array = new int[5];

    // the add method add to the end of the arrayList
    nameList.add("james");
    nameList.add("mike");
    nameList.add("bill");

    // to add to a different index in the arrayList You will use an overload version
    // of add
    // syntax arrayList.add(index, element)
    nameList.add(1, "joe");

    // returns number of elements in arrayList
    nameList.size(); // 4

    // teh get method will return teh element stored at specified index
    nameList.get(1); // joe

    // to remove an index use the remove method
    nameList.remove(1); // removes joe

    // you can replace an item with the set mthod
    nameList.set(1, "Jordan");

    // enhanced for loop
    // prints each string element in the arrayList nameList
    for (String name : nameList) {
      System.out.println(name);
    }
  }
}
