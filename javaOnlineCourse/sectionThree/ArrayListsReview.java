import java.util.ArrayList;
import java.util.Comparator;

class ArrayListsReview {
  public static void main(String[] args) {
    //arraylist are 
    ArrayList<Integer> number = new ArrayList<Integer>();
    
    //int double float boolean primitive datatypes
    //Integer class is class wrapper for objects, it gives objects wrapped by it the int data type, Double, Float, Boolean

    //to insert you must use add method
    number.add(1);
    number.add(2);
    number.add(3);

    //to print it use toString method
    System.out.println(number.toString());
    //to print sinlge value use get, by index
    System.out.println(number.get(2));
    //to remove use .remove via index, 
    System.out.println(number.remove(2));
    //to remove by vlaue use the following syntax
    System.out.println(number.remove(Integer.valueOf(4)));
    //to update a element, enter index, and then enter number via integer wrapper reference type
    number.set(2, Integer.valueOf(30));
    //to sort use the following in order
    number.sort(Comparator.naturalOrder());
    //to sort use the following reverse
    number.sort(Comparator.reverseOrder());
    //to find out how many elements in array list
    System.out.println(number.size());
    //to fins if it contains something
    System.out.println(number.contains(Integer.valueOf(10)));
    //if array list is empty
    System.out.println(number.isEmpty());
    //for each loop
    number.forEach(num -> {
      number.set(number.indexOf(num), num * 2);
      System.out.println(num*2);
    });



    //to remove all items 
    number.clear();
  }
}
