package com.luis.awsproject.utils;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Slf4j
public class AwsConfiguration {

    @Bean
    public AmazonS3 S3() {
        return AmazonS3ClientBuilder.standard()
                .withRegion("sa-east-1")
                .withPathStyleAccessEnabled(true)
                .build();
    }

    @Bean
    public AmazonDynamoDB DynamoDB() {
        return AmazonDynamoDBClientBuilder.standard()
                .withRegion("sa-east-1")
                .build();
    }

    @Bean
    @ConditionalOnMissingBean(AmazonS3.class)
    public AmazonS3 s3() {
        return AmazonS3ClientBuilder.standard().withPathStyleAccessEnabled(true).build();
    }

    @Bean
    @ConditionalOnMissingBean(AmazonDynamoDB.class)
    public AmazonDynamoDB dynamoDB(){
        return AmazonDynamoDBClientBuilder.standard().build();
    }

    private AWSCredentialsProvider provider() {
        return new AWSStaticCredentialsProvider(
                new BasicAWSCredentials("none", "none"));
    }

}
