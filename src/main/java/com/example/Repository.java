package com.example.github;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class Repository {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("owner")
    private RepositoryOwner owner;

    @JsonProperty("url")
    private String url;

    @JsonProperty("description")
    private String description;

    @JsonProperty("private")
    private Boolean isPrivate;

    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    public Repository() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public RepositoryOwner getOwner() {
        return owner;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
