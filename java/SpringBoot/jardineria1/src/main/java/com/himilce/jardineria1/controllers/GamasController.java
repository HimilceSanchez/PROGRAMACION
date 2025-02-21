package com.himilce.jardineria1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GamasController {
    
@GetMapping("/gamas")
    public String home(){
        return "/www/gamas/index";
    }

}
