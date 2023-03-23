package com.example.inventario.application;

import com.example.inventario.domain.entities.Producto;
import com.example.inventario.domain.service.ProductoSaveService;
import com.example.inventario.infrastructure.share.UsuarioNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class ProductoSave{
  private final ProductoSaveService productoSaveService;
  public Producto saveProducto(Producto producto){
    return productoSaveService.save(producto);
  }
}
