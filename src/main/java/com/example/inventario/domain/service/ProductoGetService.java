package com.example.inventario.domain.service;

import com.example.inventario.domain.entities.Producto;

public interface ProductoGetService {
  Producto getProducto(String id);
}
