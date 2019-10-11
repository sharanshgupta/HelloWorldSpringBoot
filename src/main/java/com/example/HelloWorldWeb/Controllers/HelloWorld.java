package com.example.HelloWorldWeb.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path = "/hello")
public class HelloWorld {

    @GetMapping(path="/hello", produces = "application/json")
    public String hello()
    {
        return "Hello World";
    }
}
