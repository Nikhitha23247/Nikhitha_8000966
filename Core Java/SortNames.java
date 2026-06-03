import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNames {

    public static void main(String[] args) {

        List<String> studentNames = new ArrayList<>();

        // adding names
        studentNames.add("Rahul");
        studentNames.add("Sneha");
        studentNames.add("Arjun");
        studentNames.add("Keerthi");
        studentNames.add("Vamsi");

        System.out.println("Names before sorting:");
        System.out.println(studentNames);

        // sorting names using lambda expression
        Collections.sort(studentNames, (name1, name2) -> name1.compareTo(name2));

        System.out.println();

        System.out.println("Names after sorting:");
        System.out.println(studentNames);
    }
}