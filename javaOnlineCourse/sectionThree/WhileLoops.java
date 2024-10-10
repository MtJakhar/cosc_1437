class WhileLoops {
  public static void main(String[] args) {
    int num = 5;
    int multi = 1;
    while(multi <= 10) {
      System.out.printf("%d X %d = %d \n", num, multi, num * multi);
      multi++;
    }

    int multi2 = 1;

    do{
      System.out.printf("%d X %d = %d \n", num, multi, num * multi);
      multi2++;
    } while(multi2 <= 10);

    
  }
}
