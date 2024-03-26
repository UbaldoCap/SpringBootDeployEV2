package com.example.SpringBootDeployEV2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private Environment environment;

    @GetMapping
    public String hello() {
        return environment.getProperty("welcomeMsg");
    }
}
