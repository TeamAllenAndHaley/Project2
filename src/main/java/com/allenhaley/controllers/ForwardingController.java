package com.allenhaley.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO: Find solution to allow angular's routing to work alongside /api/*
 */

@Controller
@RequestMapping("/")
public class ForwardingController {
//    @GetMapping(path = "/login")
//    public String html5Forwarding() {
//        return "forward:/index.html";
//    }
//
    @GetMapping("/")
    @ResponseBody
    public String testMethod() {
        System.out.println("Hello base.");
        return "Hello, Base!";
    }

    @GetMapping("/test")
    @ResponseBody
    public String testAlso() {
        System.out.println("Hello test.");
        return "Hello, Test!";
    }
}
