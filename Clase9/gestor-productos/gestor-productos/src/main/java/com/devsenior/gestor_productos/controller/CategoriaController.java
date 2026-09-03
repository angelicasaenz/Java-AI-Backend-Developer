package com.devsenior.gestor_productos.controller;

import com.devsenior.gestor_productos.model.Categoria;
import com.devsenior.gestor_productos.service.CategotiaService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    private final CategotiaService categotiaService;

    public CategoriaController(CategotiaService categotiaService){
        this.categotiaService = categotiaService;
    }

    @GetMapping
    public List<Categoria> obtenerCategorias(){
        return categotiaService.listarCategoria();
    }

    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria categoria){
            return categotiaService.agregarCategoria(categoria);
    }
}
