package proyectoFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import proyectoFinal.domain.Reservar;
import proyectoFinal.service.ReservaService;

@Controller
public class reservasController {

    @Autowired
    private ReservaService reservaService; 

    @GetMapping("/fragmentosReservas")
    public String mostrarFormularioReservas(Model model) {
        // Agrega un nuevo objeto reserva al modelo
        model.addAttribute("reserva", new Reservar());
        return "index"; // Nombre de la vista
    }

    @PostMapping("/fragmentosReservas")
    public String procesarFormularioReservas(@ModelAttribute("reserva") Reservar reserva) {
        reservaService.guardarReserva(reserva);
        return "index"; 
    }
}