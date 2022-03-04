package com.example.HelloWorldWeb.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
@Slf4j
public class HelloWorld {

    @GetMapping(path="/hello", produces = "application/json")
    public String hello()
    {
        log.info("Request received for Hello");
        return "Hello World";
    }

    @GetMapping(path="/bye", produces = "application/json")
    public String bye()
    {
        log.info("Request received for Bye");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Bye World";
    }

    @GetMapping(path="/error", produces = "application/json")
    public String error()
    {
        log.error("Received request from browser other than Chrome");
        return "No hello for you, use Chrome instead.";
    }
}
