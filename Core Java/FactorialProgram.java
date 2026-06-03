import java.util.Scanner;
public class FactorialProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        long fact = 1;
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        if (n < 0) {
            System.out.println("Please enter a positive number");
        } else {
            // finding factorial using loop
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is : " + fact);
        }
        sc.close();
    }
}