
package com.proyectoFinal.domain;
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
@Table(name = "afiliarse")
public class Afiliarse implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_afiliarse")
    private Long idAfiliarse;
    private String nombreCompleto;
    private String correoElectronico;
    private int fechanacimiento;

}
