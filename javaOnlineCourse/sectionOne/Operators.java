class Operators {
  public static void main(String[] args) {
    int num1 = 12;
    int num2 = 6;

    //addition
    System.out.println(num1 + num2);
    
    //subtraction
    System.out.println(num1 - num2);
    
    //multiplication
    System.out.println(num1 * num2);
    
    //division
    System.out.println(num1 / num2);
    
    //remainder
    System.out.println(num1 % num2);

    //increment
    num1 += 5;
    //increment by one, pre and post
    //post incements after code is executed
    System.out.println(num1++);
    //and pre adds before execution
    System.out.println(++num1);
    

    //decrement
    num2 -= 2;
    //works like pre and post increment, but decrements instead
    System.out.println(num1--);
    System.out.println(--num1);

    //can be done with other operators as well
    num2 *= 3;
    num2 /= 3;
    num1 %= 2;

    //relational operators
    // equality
    System.out.println(num1 == num2);
    // not
    System.out.println(num1 != num2);
    // less than
    System.out.println(num1 < num2);
    // greater than
    System.out.println(num1 > num2);
    // less than equal to
    System.out.println(num1 <= num2);
    // greater than equal to
    System.out.println(num1 >= num2);

    //logical operators
    //result in true or false
    //in && if first condition is false, it short circut the problem and does not read the rest of the code.
    //and
    System.out.println(num1 >= 18 && num2 <=40);
    //or
    System.out.println(num1 < 5 || num2 > 3);

  }
}