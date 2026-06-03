import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text;

        System.out.print("Enter some text : ");
        text = sc.nextLine();

        try {

            // creating file and writing data
            FileWriter writer = new FileWriter("output.txt");

            writer.write(text);

            writer.close();

            System.out.println("Data written successfully into output.txt");

        } catch (IOException e) {

            System.out.println("Error while writing into file");
        }

        sc.close();
    }
}