class LearnStrings {
  public static void main(String[] args) {
    char percentSign = '%';
    //this version whether this value exists in memory, if it does it will use the same address
    String name = "this is a name";
    System.out.println(name);
    String name2 = "this is a name";
    
    //You can also create a string vai a new keyword
    //this version will create teh string regardless if the value already exists, in a new address
    String name3 = new String("this is a name");

    // this should be true
    System.out.println(name == name2);
    //this should be false
    System.out.println(name == name3);

    //note that the == is comparing the memory address not the string itself

    //to compare teh vlaue of the strings you ust use equals method
    //this will evaluate to true
    System.out.println(name.equals(name3));

    String realName = "bob";
    String realPlace = "USA";
    String realAge = "1 1/2";

    //formatted strings
    System.out.printf("My name is %s. I am from %s. I am %d years old.",realName, realPlace, realAge);
    //these two do the same thing, one directly formats a string, the other formats the print statment.
    String formattedString = String.format("My name is %s. I am from %s. I am %d years old.",realName, realPlace, realAge);
    System.out.println(formattedString);

    //checking if string is empty
    String empty = "";
    System.out.println(empty.isEmpty());

    //checking length
    System.out.println(formattedString.length());

    //upper and lower case
    //note it does not change the original
    System.out.println(name.toUpperCase());
    System.out.println(name);
    System.out.println(name.toLowerCase());

    //checking string content eqaulity
    System.out.println(name.equals(name3));
    //you can choose to ignore case as well
    String weirdName = "mike";
    String weirdName2 = "MIKE";
    System.out.println(weirdName.equalsIgnoreCase(weirdName2));

    //replace 
    String sentence = "this is a sentence";

    System.out.println(sentence.replace("sentence", "smelly toe"));
    //note that it does not change original string.
    System.out.println(sentence);

    //find if string contains word
    System.out.println(sentence.contains("this"));
  }
}
