package com.demo.first_spring_test.controller;

import com.demo.first_spring_test.domain.User;
import com.demo.first_spring_test.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    // post, get, delete, put, patch, options, head
    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Thiago");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body){
        return "Hello " + body.getName();
    }
}
