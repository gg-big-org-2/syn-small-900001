package com.example.aws.uploader;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class UploadRequest {
    private String objectKey;
    private Path filePath;
    private String contentType;
    private Map<String, String> metadata;
    private boolean publicRead;

    public UploadRequest(String objectKey, Path filePath) {
        this.objectKey = objectKey;
        this.filePath = filePath;
        this.contentType = "application/octet-stream";
        this.metadata = new HashMap<>();
        this.publicRead = false;
    }

    public String getObjectKey() {
        return objectKey;
    }

    public Path getFilePath() {
        return filePath;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }
}
