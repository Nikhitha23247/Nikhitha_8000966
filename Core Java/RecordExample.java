import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// creating record
record Person(String name, int age) {
}

public class RecordExample {

    public static void main(String[] args) {

        // creating person objects
        Person p1 = new Person("Rahul", 20);

        Person p2 = new Person("Sneha", 17);

        Person p3 = new Person("Arjun", 25);

        // printing records
        System.out.println("Person Details:");
        System.out.println(p1);

        System.out.println(p2);

        System.out.println(p3);

        // adding records into list
        List<Person> people = new ArrayList<>();

        people.add(p1);

        people.add(p2);

        people.add(p3);

        // filtering people whose age is 18 or above
        List<Person> adults = people.stream()
                                    .filter(person -> person.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println();

        System.out.println("People with age 18 and above:");
        System.out.println(adults);
    }
}