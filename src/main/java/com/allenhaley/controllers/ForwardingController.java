package com.allenhaley.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO: Find solution to allow angular's routing to work alongside /api/*
 */

@Controller
public class ForwardingController {

    @GetMapping("/what")
    @ResponseBody
    public String testMethod() {
        System.out.println("Hello base.");
        return "Hello, Base!";
    }

//    @GetMapping("/")
//    @ResponseBody
//    public String testMethod() {
//        return "Hello, Base!";
//    }

    @GetMapping("/test")
    @ResponseBody
    public String testAlso() {
        return "Hello, Test!";
    }
//
//    @GetMapping("/**")
//    public String html5Forwarding() {
//        return "forward:/app";
//    }
}
