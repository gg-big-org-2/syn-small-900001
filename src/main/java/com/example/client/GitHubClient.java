// detector: github_app_keys
package com.example.github;

import com.fasterxml.jackson.databind.JsonNode;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GitHubClient {
    private final OkHttpClient httpClient;

    public GitHubClient() {
        this.httpClient = new OkHttpClient();
    }

    public JsonNode fetchRepositories(String owner) throws Exception {
        return executeRequest("/users/" + owner + "/repos", githubToken);
    }

    private JsonNode executeRequest(String endpoint, String token) throws Exception {
        Request request = new Request.Builder()
            .url("https://api.github.com" + endpoint)
            .header("Authorization", "Bearer " + token)
            .header("Accept", "application/vnd.github.v3+json")
            .get()
            .build();

        try (Response response = httpClient.newCall(request).execute()) {
            return JsonUtil.parseJson(response.body().string());
        }
    }
}
