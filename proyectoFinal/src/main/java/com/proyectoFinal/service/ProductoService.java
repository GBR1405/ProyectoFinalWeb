package com.proyectoFinal.service;


import com.proyectoFinal.domain.Producto;
import java.util.List;

public interface ProductoService {

    //Recupera una lista de los registros de la tabla producto
    public List<Producto> getProductos(boolean activos);

    //Recuperaun registro de la tabla cateogria, buscando el atributo idProducto en la tabla
    public Producto getProducto(Producto producto);

    //Elimina un registro de la tabla producto si encuentra un registro con el idProducto pasado
    public void delete(Producto producto);

    //Si el objeto producto pasado por paramentro tiene un valor en idProducto lo intenta actualizar, si no, lo agrega
    //Elimina un registro de la tabla producto si encuentra un registro con el idProducto pasado
    public void save(Producto producto);
}
