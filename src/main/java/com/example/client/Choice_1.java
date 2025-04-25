public class Choice {
    private Integer index;
    private ChatMessage message;
    private String finishReason;

    public Choice(Integer index, ChatMessage message, String finishReason) {
        this.index = index;
        this.message = message;
        this.finishReason = finishReason;
    }

    public Integer getIndex() {
        return index;
    }

    public ChatMessage getMessage() {
        return message;
    }

    public String getFinishReason() {
        return finishReason;
    }
}
