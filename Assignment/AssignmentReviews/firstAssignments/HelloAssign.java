
//This is a simple java program

/*
 * Java Programs are complied with the following syntax:
 * javac HelloAssign.java
 * it creates a class file which contains java byte code
 * to execute a file:
 * java HelloAssign
 */

//this is the class header
//public is the access specifier 
// only one public class per file and the file must share teh name with it
public class HelloAssign {
  // everything between the braces is the body

  // this below is the method header, method is a collection of statements that
  // are defined in a class, a method outside of a class is a function, java
  // doesnot have functions as every file is a class
  // this method is called main
  public static void main(String[] args) {
    // the value put into the () is an argument
    // print doesn't make a next line
    System.out.print("Hello, this is print");
    // println makes a nextline
    System.out.println("Hello this is println");

  }
}
