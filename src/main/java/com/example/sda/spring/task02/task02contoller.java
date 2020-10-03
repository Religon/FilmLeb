package com.example.sda.spring.task02;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class task02contoller {

    @GetMapping(path = "/task02", produces = MediaType.APPLICATION_PROBLEM_XML_VALUE)
    public String task02(){
        Animal animal = new Animal("pies", 3);
        return animal.getName() + " " + animal.getAge();
    }
}
