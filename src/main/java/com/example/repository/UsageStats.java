public class UsageStats {
    private Integer promptTokens;
    private Integer completionTokens;
    private Integer totalTokens;

    public UsageStats() {
        this.promptTokens = 0;
        this.completionTokens = 0;
        this.totalTokens = 0;
    }

    public Integer getPromptTokens() {
        return promptTokens;
    }

    public Integer getCompletionTokens() {
        return completionTokens;
    }

    public Integer getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }
}
