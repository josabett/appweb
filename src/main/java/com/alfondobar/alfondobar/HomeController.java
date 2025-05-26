package com.alfondobar.alfondobar;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/index")
    public String index() {
        return "index"; // templates/index.html
    }

    @GetMapping("/entrada")
    public String entrada() {
        return "entrada"; // templates/contacto.html
    }

    @GetMapping("/cocteles")
    public String cocteles() {
        return "cocteles"; // templates/productos.html
    }
    
    @GetMapping("/form")
    public String form() {
        return "form"; // templates/productos.html
    }

    @GetMapping("/pizza")
    public String pizza() {
        return "pizza"; // templates/productos.html
    }

    @GetMapping("/tragos")
    public String tragos() {
        return "tragos"; // templates/productos.html
    }

    
}