import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class Challange1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        var request = HttpRequest
                .newBuilder()
                .uri(URI.create("https://imdb-api.com/en/API/Top250Movies/" + System.getenv("API_KEY")))
                .GET()
                .build();

        var client = HttpClient.newHttpClient();

        var response =
                client.send(request, BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
