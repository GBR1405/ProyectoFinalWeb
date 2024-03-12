package proyectoFinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservas")
public class reservasController {

    @GetMapping
    public String reservas() {
        return "reservas/fragmentos"; // Nombre de la vista
    }
}