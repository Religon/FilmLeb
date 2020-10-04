package com.example.sda.spring.controller;

import com.fasterxml.jackson.core.sym.NameN;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
    private static final String MODEL_HELLO_MESSAGE_ATTRIBUTE_NAME = "helloMsg";

    @GetMapping("/hello")
    public String showHello(Model model) {
        model.addAttribute(MODEL_HELLO_MESSAGE_ATTRIBUTE_NAME, "hello in thymeleaf from model map");
        return "welcome";
    }
}
