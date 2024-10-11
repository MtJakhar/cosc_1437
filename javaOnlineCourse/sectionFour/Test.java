import java.time.LocalDate;

import java.time.LocalDate;

class Test {
  public static void main(String[] args) {
    User youngerUser = new User("Farhan Hasin Junior", "1995-01-31");

    // User olderUser = new User();
    // olderUser.birthDay = LocalDate.parse("1975-01-15");

    Book book = new Book("War and Peace", "Leo Tolstoy", 500);

    AudioBook audioBook1 = new AudioBook("Angels and Demons", "Dan Brown", 200, 5);


    youngerUser.borrow(book);

    System.out.printf("%s was born in %s", youngerUser.name, youngerUser.birthDay.toString());
    // System.out.printf("%s was born in %s", olderUser.name, olderUser.birthDay.toString());

    System.out.printf("%s has borrowed these books: %s", youngerUser.name, youngerUser.books.toString());


  }
}
