import java.util.Scanner;

public class PalindromeProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String original;
        String reverse = "";

        System.out.print("Enter any word or sentence : ");
        original = sc.nextLine();

        // removing spaces and symbols
        original = original.replaceAll("[^a-zA-Z0-9]", "");

        // converting into lowercase
        original = original.toLowerCase();

        // reversing the string
        for (int i = original.length() - 1; i >= 0; i--) {

            reverse = reverse + original.charAt(i);
        }

        // checking palindrome
        if (original.equals(reverse)) {

            System.out.println("It is a palindrome");

        } else {

            System.out.println("It is not a palindrome");
        }

        sc.close();
    }
}