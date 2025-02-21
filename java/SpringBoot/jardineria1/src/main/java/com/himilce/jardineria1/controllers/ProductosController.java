package com.himilce.jardineria1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ProductosController {
    
    @GetMapping("/productos") // 
    public String home(){
        return "/www/productos/index";
    }

    @GetMapping("/productos/listar") //select * from productos
    public String getAll(){
        return "/www/productos/listar";
    }

    //tener un endpoint que  muestre un producto getId()
}
