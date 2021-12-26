package io.javanrains.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController 
public class GreetingController {

    @Value("${my.greeting}")
    private String greeting;

    @Value("${my.list.values}")
    private List<String> values;

    @Value("#{${my.dbvalues}}")
    private Map<String,String> dbvalues;


    @Autowired
    private GreetingConfig config;
    @GetMapping("greeting")
    public String Hello() {
        return  config.getConnection() + " " + config.getPort();
    }
}
