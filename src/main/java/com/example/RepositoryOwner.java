package com.example.github;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RepositoryOwner {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("login")
    private String login;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("type")
    private String type;

    @JsonProperty("url")
    private String url;

    public RepositoryOwner() {}

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }
}
