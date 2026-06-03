import java.util.Scanner;
public class FibonacciNumber {
    // recursive function to find fibonacci number
    static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the position number : ");
        num = input.nextInt();
        if (num < 0) {
            System.out.println("Invalid input");
        } else {
            int answer = fib(num);
            System.out.println("Fibonacci value is : " + answer);
        }
        input.close();
    }
}