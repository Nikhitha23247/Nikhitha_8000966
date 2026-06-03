import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {

    public static void main(String[] args) {

        try {

            // Create HTTP client
            HttpClient client = HttpClient.newHttpClient();

            // Create request for GitHub API
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com"))
                    .GET()
                    .build();

            // Send request and receive response
            HttpResponse<String> response =
                    client.send(
                            request,
                            HttpResponse.BodyHandlers.ofString());

            System.out.println("Response Status Code : "
                    + response.statusCode());

            System.out.println("\nResponse Body:\n");

            System.out.println(response.body());

        } catch (Exception e) {

            System.out.println("Something went wrong.");
            System.out.println(e.getMessage());
        }
    }
}