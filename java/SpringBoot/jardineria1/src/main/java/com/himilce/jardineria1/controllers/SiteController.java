package com.himilce.jardineria1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

    @GetMapping("/")
    public String home(){
        return "/www/site/index";
    }
    
}
