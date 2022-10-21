// detector: openai_apikey
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import com.google.gson.JsonObject;
import com.google.gson.Gson;

public class OpenAIChatClient {
    private static final String API_BASE_URL = "https://api.openai.com/v1";
    private final HttpClient httpClient;

    public OpenAIChatClient() {
        this.httpClient = HttpClient.newHttpClient();
    }

    public ChatResponse sendMessage(ChatRequest request) throws Exception {
        String jsonPayload = new Gson().toJson(request);
        HttpRequest httpRequest = HttpRequest.newBuilder()
            .uri(new URI(API_BASE_URL + "/chat/completions"))
            .header("Authorization", "Bearer " + openaiApiKey)
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString(jsonPayload))
            .build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return ChatResponse.fromJson(response.body());
    }
}
