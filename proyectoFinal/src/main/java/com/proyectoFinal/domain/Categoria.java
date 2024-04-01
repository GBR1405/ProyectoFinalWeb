package com.proyectoFinal.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data; //Pone todo get y set

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    private String nombre;
    private String imagen;
    private boolean activo;
}
