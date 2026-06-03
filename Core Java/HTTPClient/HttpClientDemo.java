import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {

    public static void main(String[] args) {

        try {

            // creating http client
            HttpClient client = HttpClient.newHttpClient();

            // github public api
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com"))
                    .GET()
                    .build();

            // sending request
            HttpResponse<String> response =
                    client.send(
                            request,
                            HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code : "
                    + response.statusCode());

            System.out.println("\nResponse Data:\n");

            System.out.println(response.body());

        } catch (Exception e) {

            System.out.println("Error : " + e.getMessage());
        }
    }
}