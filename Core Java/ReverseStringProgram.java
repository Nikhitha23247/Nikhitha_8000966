import java.util.Scanner;
public class ReverseStringProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        String reversed = "";
        System.out.print("Enter a string : ");
        text = sc.nextLine();
        // reversing the string using loop
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        System.out.println("Reversed string : " + reversed);
        sc.close();
    }
}