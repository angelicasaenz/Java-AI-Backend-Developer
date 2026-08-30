package com.devsenior.gestor_productos.service;

import com.devsenior.gestor_productos.model.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    private List<Producto> productos = new ArrayList<>();

    // Listar productos

    public List<Producto> listarProductos(){
        return productos;
    }

    // Agregar productos

    public Producto agregarProducto(Producto producto){
        productos.add(producto);
        return producto;
    }
}
