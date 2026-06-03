import java.util.Scanner;

// custom exception class
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {

        super(message);
    }
}

public class CustomExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("Enter your age : ");
        age = sc.nextInt();

        try {

            // checking age condition
            if (age < 18) {

                throw new InvalidAgeException("You are not eligible because age is below 18");
            }

            System.out.println("You are eligible");

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}