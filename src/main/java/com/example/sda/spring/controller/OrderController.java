package com.example.sda.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/create")
    public String showOrderForm(final ModelMap modelMap) {
        modelMap.addAttribute("orderForm", new OrderForm());
        return "orders";
    }

    @PostMapping("/create")
    public String handleNewOrder(@Valid @ModelAttribute("orderForm") final OrderForm orderForm, final Errors errors) {
        // handle new Order here
        if (errors.hasErrors()) {
            return "orders";
        }
        return "redirect:/hello";
    }
}

