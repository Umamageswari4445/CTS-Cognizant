import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Ex36_HTTPClientAPI {
    public static void main(String[] args) {
        try {
            // Create HTTP client
            HttpClient client = HttpClient.newHttpClient();

            // Build request
            HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://api.github.com/users/octocat"))
                .GET()
                .build();

            // Send request and get response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Print status and body
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body:\n" + response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
