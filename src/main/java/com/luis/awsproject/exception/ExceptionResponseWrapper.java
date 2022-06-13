package com.luis.awsproject.exception;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class ExceptionResponseWrapper {
    private String message;
    private Date timestamp;
}
