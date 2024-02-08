package com.example.testprofiles.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class homeController {
    @Value("${simple.text}")
    public String profileConfig;
    @GetMapping("/test")
    public String testServer(){
        return "Welcome to Vtex!!!! & "+profileConfig ;
    }



}
