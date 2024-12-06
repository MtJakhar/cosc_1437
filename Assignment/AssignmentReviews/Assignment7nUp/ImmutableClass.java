package AssignmentReviews.Assignment7nUp;

/*
 * this is an immutable class with immutable fields
 * Immutable classes do not have setter methods
 * the class should be declared final 
 * and all the fields should be private and final
 * and the constructors must initialze all the class fields
 */
public final class ImmutableClass {
  private final String name;
  private final String email;

  public ImmutableClass(String name, String email) {
    this.name = name;
    this.email = email;
  }

  // this is an enum, it creates an enum datatype that has only a few possible
  // values
  // Enum is considered to be a specialized class and all the things listed in the
  // enum are instance of that enum class
  enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void printDay() {
    Day workday = Day.FRIDAY;
    System.out.println(workday);
  }

}
