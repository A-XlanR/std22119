package com.xlan.demo.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return ("Hello World!");
    }
}
