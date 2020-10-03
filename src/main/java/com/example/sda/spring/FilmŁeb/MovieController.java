package com.example.sda.spring.FilmŁeb;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @PostMapping("/createNewMovie")
    @ResponseBody
    public String createNewMovie(){
        return null;
    }

    @GetMapping(path = "/getId")
    public String getId(){
      return null;
    }

    @GetMapping(path = "/getAll")
    public String getAll(){
        return null;
    }

    @GetMapping(path = "/deleteMovie")
    public void delete(){
    }
}
