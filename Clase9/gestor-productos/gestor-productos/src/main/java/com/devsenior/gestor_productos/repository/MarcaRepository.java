package com.devsenior.gestor_productos.repository;

import com.devsenior.gestor_productos.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository <Marca, Long> {
}
