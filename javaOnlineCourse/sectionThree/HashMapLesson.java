import java.util.HashMap;

class HashMapLesson {
  public static void main(String [] args) {
    //Hesh maps have a key value pair, you will use a wrapper to create them and the key may be a String, and the value, can be what ever it is you need.
    HashMap<String, Integer> examScores = new HashMap<String, Integer>();
    examScores.put("Math", 75);
    examScores.put("Sociology", 85);
    examScores.put("English", 95);
    examScores.put("computer programming", 100);

    examScores.putIfAbsent("Math", 70);
    //replace
    examScores.replace("Math", 70);

    //clears map
    examScores.clear();
    //get hashmap size
    examScores.size();

    System.out.println(examScores.get("English"));
    System.out.println(examScores.getOrDefault("relgion", 0));

    examScores.forEach((subject, score) -> {
      System.out.println(subject + " - " + score);
    });

    //if included by key or value
    System.out.println(examScores.containsKey("Math"));
    System.out.println(examScores.containsValue(100));
  }
}