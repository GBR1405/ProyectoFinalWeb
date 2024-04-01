package com.proyectoFinal.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data; //Pone todo get y set

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long idProducto;
//    private Long idCategoria;
    private String nombre;
    private String descripcion;
    private double precio;
    private String imagen;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;
}


