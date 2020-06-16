package com.jenkins.core.controller;


import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business")
public class JenkinsController {
    @GetMapping
    private java.lang.String helloWorld() {
        return new Gson().toJson("hello world new");
    }
}
