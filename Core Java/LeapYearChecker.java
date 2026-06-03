import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        // taking year from user
        System.out.print("Enter a year: ");
        year = input.nextInt();
        // checking leap year condition
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is not a Leap Year");
                }
            } else {
                System.out.println(year + " is a Leap Year");
            }
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        input.close();
    }
}