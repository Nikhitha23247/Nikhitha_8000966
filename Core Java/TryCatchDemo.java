import java.util.Scanner;

public class TryCatchDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.print("Enter first number : ");
        firstNumber = input.nextInt();

        System.out.print("Enter second number : ");
        secondNumber = input.nextInt();

        try {

            int result = firstNumber / secondNumber;

            System.out.println("Division result : " + result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
        }

        input.close();
    }
}