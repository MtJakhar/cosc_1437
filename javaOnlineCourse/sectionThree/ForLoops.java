class ForLoops {
  public static void main(String[] args) {
    //here is the syntax of for loop
    // initialization, condition, increment
    for(int number = 1; number <= 10; number++) {
      System.out.println(number);
    }

    int numbers[] ={1,2,3,4,5,6,7,8,9,10};

    int sum = 0;

    for(int i = 1; i < numbers.length; i++) {
      sum += numbers[i];
      System.out.println(numbers[i]);
    }

    System.out.println(sum);

    for(int mult = 1; mult < 10; mult++){
      System.out.printf("%d X %d = %d \n", mult);
    }

    for(int num = 1; num < 10; num++){
      for(int multi = 1; multi < 10; multi++){
        System.out.printf("%d X %d = %d \n", num, multi, num * multi);
      }
    }

    for(int number = 1; number <= 50; number++) {
      if(number % 2 == 1){
        System.out.println(number);
      }
    }

    //special for loop
    for(int number : numbers) {
      System.out.println(number);
    }


  }
}
