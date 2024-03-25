package samplerest.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String hello() {
        return "HELLO IT WORKS!!!";
    }

}
