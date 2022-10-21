import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class ChatResponse {
    private String id;
    private String model;
    private List<Choice> choices;
    private UsageStats usage;

    public static ChatResponse fromJson(String json) {
        JsonObject obj = new Gson().fromJson(json, JsonObject.class);
        ChatResponse response = new ChatResponse();
        response.id = obj.get("id").getAsString();
        response.model = obj.get("model").getAsString();
        response.choices = new ArrayList<>();
        response.usage = new UsageStats();
        return response;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public List<Choice> getChoices() {
        return choices;
    }
}
