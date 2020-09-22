package com.salesianostriana.Ejemplo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/index")
    public String controllerPrincipal(Model model){
        model.addAttribute("mensaje", "loco, estoy loco");
        return "../index.html";
    }
}
