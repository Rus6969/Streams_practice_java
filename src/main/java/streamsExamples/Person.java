package streamsExamples;

public class Person {

  private final String name;
  private int age = 0;
  private final Gender gender;

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", gender=" + gender +
            '}';
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Gender getGender() {
    return gender;
  }

  public Person(String name, Gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
}
