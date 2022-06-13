package com.luis.awsproject.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Attachment {
    private String bucket;
    private String key;
    private String fileName;
    private String contentType;
}
