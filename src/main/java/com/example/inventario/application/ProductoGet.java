package com.example.inventario.application;

import com.example.inventario.domain.entities.Producto;
import com.example.inventario.domain.service.ProductoGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoGet {

  private final ProductoGetService productoGetService;

  public Producto getProducto(String id){
    return productoGetService.getProducto(id);
  }
}
