// detector: aws_iam
package com.example.aws.uploader;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

public class S3Uploader {
    private final S3Client s3Client;
    private final String bucketName;

    public S3Uploader(String bucketName) {
        this.bucketName = bucketName;
        this.s3Client = S3Client.builder()
            .credentialsProvider(() -> AwsBasicCredentials.create(
                awsAccessKeyId,
                awsSecretAccessKey
            ))
            .region(awsRegion)
            .build();
    }

    public void uploadFile(String key, String filePath) throws Exception {
        s3Client.putObject(PutObjectRequest.builder()
            .bucket(bucketName)
            .key(key)
            .build(), filePath);
    }

    public void close() {
        s3Client.close();
    }
}
