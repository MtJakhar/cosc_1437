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
  }
}
