package com.example.DockerLearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${user}")
    private String userName;

    @GetMapping("/test/")
    public String hello(){
        return "Dzień Dobry!" + userName;
    }


}
