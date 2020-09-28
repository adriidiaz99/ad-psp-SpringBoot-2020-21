package com.salesianostriana.Ejemplo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String controllerPrincipal(Model model){
        model.addAttribute("mensaje", "loco, estoy loco");
        return "index.html";
    }

    @GetMapping("/fecha")
    public String fechaHora(Model model){
        model.addAttribute("fecha", LocalDate.now());
        return "fecha";
    }
}
