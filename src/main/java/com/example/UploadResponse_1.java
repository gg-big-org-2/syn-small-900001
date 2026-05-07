package com.example.aws.uploader;

import java.time.LocalDateTime;

public class UploadResponse {
    private String objectKey;
    private String bucketName;
    private String eTag;
    private LocalDateTime uploadTime;
    private long fileSize;

    public UploadResponse(String objectKey, String bucketName, String eTag) {
        this.objectKey = objectKey;
        this.bucketName = bucketName;
        this.eTag = eTag;
        this.uploadTime = LocalDateTime.now();
    }

    public String getObjectKey() {
        return objectKey;
    }

    public String getBucketName() {
        return bucketName;
    }

    public String getETag() {
        return eTag;
    }

    public LocalDateTime getUploadTime() {
        return uploadTime;
    }
}
