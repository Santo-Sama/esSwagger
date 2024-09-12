package com.example.esSwagger.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/name")
    public String getName(@RequestParam String name){
        return name;
    }

    @PostMapping("/eman")
    public String postName(@RequestParam String name){
        StringBuilder nameString = new StringBuilder(name);
        return nameString.reverse().toString();
    }
}
