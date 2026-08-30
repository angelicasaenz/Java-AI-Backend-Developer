package com.devsenior.gestor_productos.controller;


import com.devsenior.gestor_productos.model.Producto;
import com.devsenior.gestor_productos.service.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> obtenerProductos(){
        return productoService.listarProductos();
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto){
        return productoService.agregarProducto(producto);

    }
}
