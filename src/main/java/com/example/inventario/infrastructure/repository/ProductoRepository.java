package com.example.inventario.infrastructure.repository;

import com.example.inventario.infrastructure.dto.ProductoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends JpaRepository<ProductoDto, String>,
    CrudRepository<ProductoDto, String>{

}
