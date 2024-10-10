import java.util.Arrays;

class ArrayReview {
  public static void main(String[] args) {
    //declaring arrays you must use the following syntax
    char vowels[] = new char[5];
    //note the once the array is declare the length of it will be immutable

    //a e i o _
    //use of subscripts and array positional elements start at 0
    vowels[0] = 'a';
    vowels[1] = 'e';
    vowels[2] = 'i';
    vowels[3] = 'o';
    vowels[4] = 'u';
    System.out.println(vowels[2]);

    //in order to print out an array you must do the following
    System.out.println(Arrays.toString(vowels));

    // you can define an array in one line
    //array length will be inferred
    char vowels2[] = {'a', 'e', 'i', 'o', 'u'};

    //array methods
    System.out.println(vowels2.length);
    //note that String class has method length(), in array it is .length no ();

    //sort method
    //changes original array
    Arrays.sort(vowels2);

    int start = 1;
    int end = 4;

    // you can determine where you want to sort with this method
    Arrays.sort(vowels, start, end);

    //binary search method, must sorted before hand

    char key = 'o';
    int foundIndex = Arrays.binarySearch(vowels2, key);
    //you can also enter start and end as a parameter
    int foundIndex2 = Arrays.binarySearch(vowels2, start, end, key);

    System.out.println(Arrays.toString(vowels2));
    System.out.println(foundIndex);
    
    //fill method
    Arrays.fill(vowels2, 'x');
    //takes start and end
    Arrays.fill(vowels2, start, end, 'x');
    System.out.println(foundIndex2);

    //copying an int does not create  new array with the same value, it references the memory address
    int numbers[] = {1,2,3,4,5};
    int copyOfNumbers[] = numbers;
    
    Arrays.fill(numbers, 0);
    System.out.println(numbers);
    System.out.println(copyOfNumbers);
    
    //in order to create a new array with the same values you must use the follwoing method
    int copyOfNumbers2[] = Arrays.copyOf(numbers, 5);
    //note you can change eh length if you wish

    //use copyOfRange if you want to copy certain elements
    // int copyOfNumbers2[] = Arrays.copyOfRange(numbers, start, end);
    Arrays.fill(numbers, 0);

    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(copyOfNumbers2));


    //like strings the == operator will compare memory address
    System.out.println(numbers == copyOfNumbers2);
    //Arrays, like the String class, has an equals() method which takes the two compared arrays.
    System.out.println(Arrays.equals(numbers, copyOfNumbers2));
  }
}
