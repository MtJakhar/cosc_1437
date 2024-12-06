package AssignmentReviews.Assignment7nUp;

public class Tokenizing {
  /*
   * Tokenizing a string is a process of breaking a string dowin into its
   * components, which are called tokens. The split method ca be use to tokeize
   * strings
   */
  public static void main() {
    String sentence = "peach berry straw vanilla";
    String[] tokens = sentence.split(" ");
    for (String s : tokens) {
      System.out.println(s);
    }

    String sentence2 = "one and two and three and four";
    String[] tokens2 = sentence2.split(" and ");
    for (String token : tokens2) {
      System.out.println(token);
    }

    // to get two tokens wrap them in a bracket
    String sentence3 = "one-two-three.gmail.com";
    String[] tokens3 = sentence3.split("[-.]");
    for (String token : tokens3) {
      System.out.println(token);
    }
  }
}
