public class theStringDataType {
  public static void main(String[] args) {
    /*
     * String is a class type variable meaning it is a programmer created datatype
     * that is trying to mimic a primitive variable
     * 
     * unlike primitive variables the String "datatype" does hold the value of the
     * string it holds, instead it tells you the address of the actually place in
     * memory the string is being held.
     */

    // use the assignment op to assign a string

    String name = "My name";

    // because String is a class and not a primitve datatype it has methods
    System.out.println(name.length());
  }
}
