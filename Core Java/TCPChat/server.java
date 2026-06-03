import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server is waiting for connection...");

            Socket socket = serverSocket.accept();

            System.out.println("Client Connected");

            BufferedReader input =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));

            PrintWriter output =
                    new PrintWriter(
                            socket.getOutputStream(),
                            true);

            String message = input.readLine();

            System.out.println("Client : " + message);

            output.println("Hello Client, message received!");

            socket.close();
            serverSocket.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}