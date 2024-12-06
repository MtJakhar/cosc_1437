package AssignmentReviews.Assignment7nUp;

public class StringMethods {
  public static void main(String[] args) {
    String sentence = "this is a sentence.";
    String word1 = "this";
    String word2 = "not";

    // string methods that can be used with string class
    sentence.contains(word1);
    sentence.contains(word2);
    sentence.startsWith(word1);
    sentence.endsWith(word2);
    sentence.indexOf('e');
    sentence.indexOf(word2);

  }
  /*
   * String substring(int start);
   * boolean regionMatches(int start, String str, int start2, int n);
   */

  public void checkString(String words) {
    if (words.isEmpty()) {
      System.out.println("String is Empty");
    }
    if (words.isBlank()) {
      System.out.println("String is blank");
    }
  }
}
