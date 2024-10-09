class HelloWorld {
  public static void main(String[] args) {
    int age = 27;

    System.out.println("I am " + age + " years old.");

    //all primative data types
    byte aSingleByte = 100;
    short aSmallNumber = 2000;
    int anInteger = 1230123;
    long aLargeNumber = 223413123234234L;

    double aDouble = 1.234;
    float aFloat = 4.345F;

    boolean isTrue = true;
    boolean isFalse = false;

    char characterHere = 'k';

    //widing conversion
    int num1 = 5;
    double num2 = num1;
    System.out.println(num2);

    //narrowing conversion
    //can only be done with type casting and explicit conversion
    double number1 = 5.8;
    int number2 = (int)number1;
    System.out.println(number2);
  }
}