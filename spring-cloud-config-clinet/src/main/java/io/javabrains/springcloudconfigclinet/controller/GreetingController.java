package io.javabrains.springcloudconfigclinet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GreetingController {

    @Value("${my.greeting}")
    private String greeting;

    @Autowired
    private GreetingConfig config;
    @GetMapping("greeting")
    public String Hello() {
        return greeting+ "  "+  config.getConnection() + " " + config.getPort();
    }
}
