package com.example.sda.spring.controller;

import com.fasterxml.jackson.core.sym.NameN;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World!") String name){
        return "Hello " + name;
    }

    @GetMapping("/favourite")
    public String favourite(@PathVariable(value = "number") String number, @RequestParam(value = "name", required = false) String name){
        return "hello "+ name + " - favourite number is " + number;
    }
}
