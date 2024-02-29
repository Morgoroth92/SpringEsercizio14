package com.example.SpringEsercizio14.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "")
public class BasicController {
    @GetMapping
    public String helloUser(){
        return "Hello User, and welcome!";
    }
}