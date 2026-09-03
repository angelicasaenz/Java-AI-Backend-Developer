package com.devsenior.gestor_productos.service;


import com.devsenior.gestor_productos.model.Categoria;
import com.devsenior.gestor_productos.model.Marca;
import com.devsenior.gestor_productos.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategotiaService {

    private final CategoriaRepository  categoriaRepository;

    public CategotiaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> listarCategoria(){
        return categoriaRepository.findAll();
    }

    public Categoria agregarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }


}
