package com.allenhaley.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

/**
 * TODO: Find solution to allow angular's routing to work alongside /api/*
 */

@Controller
public class ForwardingController {
    
    @GetMapping("/**/{[path:[^\\.]*}/**")
    public String html5Forwarding() {
        return "forward:/";
    }
}
