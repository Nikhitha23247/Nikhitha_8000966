import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int total = 0;
        System.out.print("How many elements do you want to enter? ");
        n = input.nextInt();
        int arr[] = new int[n];
        // reading array values
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        // calculating total
        for (int i = 0; i < n; i++) {
            total = total + arr[i];
        }
        double avg = (double) total / n;
        System.out.println();
        System.out.println("Sum of array elements : " + total);
        System.out.println("Average value : " + avg);
        input.close();
    }
}