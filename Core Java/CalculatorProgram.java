import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double firstNumber, secondNumber, answer;
        int option;

        // taking numbers from user
        System.out.print("Please enter the first number: ");
        firstNumber = input.nextDouble();

        System.out.print("Enter the 2nd number: ");
        secondNumber = input.nextDouble();

        // showing menu
        System.out.println("\nChoose the operation you would like to perform:");
        System.out.println("1 --> Addition");
        System.out.println("2 --> Subtraction");
        System.out.println("3 --> Multiplication");
        System.out.println("4 --> Division");

        System.out.print("Enter your choice: ");
        option = input.nextInt();

        // checking user choice
        if (option == 1) {

            answer = firstNumber + secondNumber;
            System.out.println("Addition = " + answer);

        } 
        else if (option == 2) {

            answer = firstNumber - secondNumber;
            System.out.println("Subtraction = " + answer);

        } 
        else if (option == 3) {

            answer = firstNumber * secondNumber;
            System.out.println("Multiplication = " + answer);

        } 
        else if (option == 4) {

            if (secondNumber != 0) {

                answer = firstNumber / secondNumber;
                System.out.println("Division = " + answer);

            } else {

                System.out.println("Can't divide by zero!");
            }

        } 
        else {

            System.out.println("Invalid option selected");
        }

        input.close();
    }
}