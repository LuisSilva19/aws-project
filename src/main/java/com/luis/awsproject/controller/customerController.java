package com.luis.awsproject.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get")
@Log4j2
@RequiredArgsConstructor
public class customerController {

    @Value("${customer.name}")
    private String name;
    @Value("${customer.age}")
    private String age;
    @Value("${bucket.region}")
    private String region;

    @GetMapping
    public List<String> get() {
        log.info("funfou");
        return List.of(name, age, region);
    }
}
