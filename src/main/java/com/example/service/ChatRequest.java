import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ChatRequest {
    private String model;
    private List<ChatMessage> messages;
    private Double temperature;

    @SerializedName("max_tokens")
    private Integer maxTokens;

    public ChatRequest(String model, List<ChatMessage> messages) {
        this.model = model;
        this.messages = messages;
        this.temperature = 0.7;
    }

    public String getModel() {
        return model;
    }

    public List<ChatMessage> getMessages() {
        return messages;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
