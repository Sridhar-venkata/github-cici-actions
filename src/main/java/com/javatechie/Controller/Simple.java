package com.javatechie.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Simple {

    @GetMapping("/wish")
    public String wish()
    {
        return "Happy birthday to you...";
    }

}
