import java.time.LocalDate;
import java.util.ArrayList;
import java.time.Period;

public class User {
  private String name;
  private LocalDate birthDay;
  public ArrayList<Book> books = new ArrayList<Book>();

  User(String name, String birthday) {
    this.name = name;
    this.birthDay = LocalDate.parse(birthDay);
  }

  public String getName() {
    return this.name;
  }
  public LocalDate getBirthday() {
    return this.birthDay;
  }

  public void borrow(Book book) {
    this.books.add(book);
  }

  public int age() {
    int age = Period.between(this.birthDay, LocalDate.now().getYears());

    return age;
  }

}
