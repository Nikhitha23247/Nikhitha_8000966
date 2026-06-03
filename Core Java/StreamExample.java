import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        // adding values into list
        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        numbers.add(31);
        numbers.add(40);
        numbers.add(55);
        numbers.add(68);

        System.out.println("Original List:");
        System.out.println(numbers);

        // filtering even numbers using Stream API
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println();

        System.out.println("Even Numbers:");
        System.out.println(evenNumbers);
    }
}