package AssignmentReviews.Assignment7nUp;

public class Player extends Character {
  String race;
  String name;
  int age;
  String jobClass;

  // The super keyword can be used to call a super class constructor
  public Player() {
    super();
    this.race = "Human";
    this.name = "Naam";
    this.age = 20;
    this.jobClass = "Fighter";
  }

  public Player(int health, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma,
      String race, String name, int age, String jobClass) {
    super(health, strength, dexterity, constitution, intelligence, wisdom, charisma);
    this.race = race;
    this.name = name;
    this.age = age;
    this.jobClass = jobClass;
  }

  // setters
  public void setRace(String race) {
    this.race = race;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setJobClass(String jobClass) {
    this.jobClass = jobClass;
  }

  // getters
  public String getRace() {
    return race;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getJobClass() {
    return jobClass;
  }

  // method
  @Override
  public void Attack() {
    System.out.println(this.name + " Attack!!");
  }

}
