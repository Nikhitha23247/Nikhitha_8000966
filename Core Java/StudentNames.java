import java.util.ArrayList;
import java.util.Scanner;

public class StudentNames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();

        int totalStudents;

        System.out.print("Enter number of students : ");
        totalStudents = sc.nextInt();

        sc.nextLine(); // to clear buffer

        // adding names into arraylist
        for (int i = 1; i <= totalStudents; i++) {

            System.out.print("Enter student name " + i + " : ");

            String studentName = sc.nextLine();

            nameList.add(studentName);
        }

        System.out.println();
        System.out.println("Student List");

        // displaying names
        for (String name : nameList) {

            System.out.println(name);
        }

        sc.close();
    }
}