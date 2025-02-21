package com.himilce.jardineria1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/*esta clase de java va a ser un controlador, por ser controlador su funcion exclusiva
es recibir peticiones http tipo GET, PATCH, POST, DELETE*/ 
// Framework --> mvc, decoradores
// el decorador del framework()SPB @controller dota a la clase para recibir peticiones HTTP
@Controller
public class HomeController {
    // con este decorador tomcat va a ejecutar la raiz del sitio 
    // y va a interpretar el index.html
    @GetMapping("/uy")
    public String home(){
        return "/www/site/index";
    }
    
    @GetMapping("/qSomos")
    public String qSomos(){
        return "/www/site/qSomos";
    }
    
    @GetMapping("/Contacto")
    public String contacto(){
        return "/www/site/Contacto";
    }
}
