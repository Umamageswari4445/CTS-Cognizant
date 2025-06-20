import java.util.*;
import java.util.stream.Collectors;

record Person(String name, int age) {}
public class ImmutabledataClass {
  

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 25),
            new Person("Bob", 17),
            new Person("Charlie", 30)
        );

        System.out.println("All people:");
        people.forEach(System.out::println);

        System.out.println("\nAdults (18+):");
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        adults.forEach(System.out::println);
    }
}

    

