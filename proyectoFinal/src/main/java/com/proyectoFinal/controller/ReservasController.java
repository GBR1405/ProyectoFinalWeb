package com.proyectoFinal.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservas")
public class ReservasController {

    @GetMapping
    public String reservas(Model model) {
        
        return "reservas/reservas";
    }
}