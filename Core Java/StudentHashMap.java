import java.util.HashMap;
import java.util.Scanner;

public class StudentHashMap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        int n;

        System.out.print("How many students do you want to add? ");
        n = input.nextInt();

        input.nextLine(); // clearing buffer

        // adding student details
        for (int i = 1; i <= n; i++) {

            System.out.print("Enter student ID : ");
            int id = input.nextInt();

            input.nextLine();

            System.out.print("Enter student name : ");
            String name = input.nextLine();

            students.put(id, name);

            System.out.println();
        }

        // searching by ID
        System.out.print("Enter ID to search : ");
        int searchId = input.nextInt();

        // checking if ID exists
        if (students.containsKey(searchId)) {

            System.out.println("Student Name : " + students.get(searchId));

        } else {

            System.out.println("Student ID not found");
        }

        input.close();
    }
}