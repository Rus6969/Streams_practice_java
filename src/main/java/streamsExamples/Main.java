package streamsExamples;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Person> people = getPeople();

    // Imperative approach ❌

    /*

    List<streamsExamples.Person> females = new ArrayList<>();

    for (streamsExamples.Person person : people) {

      if (person.getGender().equals(streamsExamples.Gender.FEMALE)) {
        females.add(person);
      }
    }

    females.forEach(System.out::println);

    */

    // Declarative approach ✅

    // Filter
    List<Person> females = people
            .stream()
            .filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());

  //    females.forEach(System.out::println);

    // Sort (by age)
    List<Person> sortedByAge = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());

   // sortedByAge .forEach(System.out::println);

    // All match
    boolean allMatch = people.stream()
            .allMatch(person -> person.getAge()>18);

//    System.out.println(allMatch);
    // Any match
    boolean anyMatch = people.stream()
        .anyMatch(person -> person.getAge() > 121);

//    System.out.println(anyMatch);
    // None match
    boolean noneMatch = people.stream()
        .noneMatch(person -> person.getName().equals("Antonio"));

//    System.out.println(noneMatch);

    // Max
    /*
     max returns optional class because :
     The Stream max() method will return an Optional that contains the largest value of the stream. The largest values are evaluated based on the passed Comparator argument.

If the stream is empty, then an empty Optional is returned.
If the largest value returned is null, then NullPointerException is thrown.
The max method is a terminal operation.
     */
    //Optional<streamsExamples.Person> retunOptional =
      people.stream().max(Comparator.comparing(Person::getAge));
//        .ifPresent(System.out::println);

    // Min
    people.stream()
        .min(Comparator.comparing(Person::getAge));
//        .ifPresent(System.out::println);

    // Group
    Map<Gender, List<Person>> groupByGender = people.stream()
        .collect(Collectors.groupingBy(Person::getGender));

//    groupByGender.forEach((gender, people1) -> {
//      System.out.println(gender);
//      people1.forEach(System.out::println);
//      System.out.println();
//    });

    Optional<String> oldestFemaleAge = people.stream()
        .filter(person -> person.getGender().equals(Gender.FEMALE))
        .max(Comparator.comparing(Person::getAge))
        .map(Person::getName);

    oldestFemaleAge.ifPresent(System.out::println);
  }

  private static List<Person> getPeople() {
    return List.of(
        new Person("Antonio", Gender.MALE),
        new Person("Alina Smith", Gender.FEMALE),
        new Person("Helen White", Gender.FEMALE),
        new Person("Alex Boz", Gender.MALE),
        new Person("Jamie Goa", Gender.MALE),
        new Person("Anna Cook", Gender.FEMALE),
        new Person("Zelda Brown", Gender.FEMALE)
    );
  }

}
