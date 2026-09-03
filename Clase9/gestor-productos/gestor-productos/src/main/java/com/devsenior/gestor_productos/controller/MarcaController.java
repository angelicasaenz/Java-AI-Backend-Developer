package com.devsenior.gestor_productos.controller;


import com.devsenior.gestor_productos.model.Marca;
import com.devsenior.gestor_productos.service.MarcaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {

    private final MarcaService marcaService;

    public MarcaController(MarcaService marcaService){
        this.marcaService = marcaService;
    }

    @GetMapping
    public List<Marca> obtenerMarcas(){
        return marcaService.listarMarca();
    }

    @PostMapping
    public Marca crearMarca(@RequestBody Marca marca){
            return marcaService.agregarMarca(marca);
    }
}
