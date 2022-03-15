package com.example.aws.uploader;

public class S3Config {
    private String bucketName;
    private String region;
    private int maxRetries;
    private boolean enableEncryption;

    public S3Config(String bucketName, String region) {
        this.bucketName = bucketName;
        this.region = region;
        this.maxRetries = 3;
        this.enableEncryption = true;
    }

    public String getBucketName() {
        return bucketName;
    }

    public String getRegion() {
        return region;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public boolean isEncryptionEnabled() {
        return enableEncryption;
    }
}
