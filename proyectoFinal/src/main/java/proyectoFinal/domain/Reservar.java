package proyectoFinal.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name = "reservar")
public class Reservar implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservar")
    private Long idReservar;
    
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    
    @Column(name = "correo_electronico")
    private String correoElectronico;
    
    @Column(name = "cantidad_personas")
    private int cantidadPersonas;
    
}

