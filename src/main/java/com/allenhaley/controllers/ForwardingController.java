package com.allenhaley.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardingController {
    @RequestMapping(value = "/**/{path:[^\\.]+}")
    public String html5Forwarding() {
        return "forward:/";
    }
}
