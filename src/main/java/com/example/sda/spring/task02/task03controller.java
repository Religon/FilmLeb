package com.example.sda.spring.task02;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class task03controller {

    @PostMapping("/task03")
    @ResponseBody
    public Animal task03(@RequestBody Animal animal){

        animal.setName("pies");
        return animal;
    }
}
