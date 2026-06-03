import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        // taking input from user
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        System.out.println("\nMultiplication Table of " + number);
        // loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
        sc.close();
    }
}