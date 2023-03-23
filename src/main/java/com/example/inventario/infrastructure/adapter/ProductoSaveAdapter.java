package com.example.inventario.infrastructure.adapter;

import com.example.inventario.domain.entities.Producto;
import com.example.inventario.domain.service.ProductoSaveService;
import com.example.inventario.infrastructure.mapper.ProductoMapper;
import com.example.inventario.infrastructure.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoSaveAdapter implements ProductoSaveService {

  private final ProductoRepository productoRepository;
  private final ProductoMapper productoMapper;

  public Producto save(Producto producto){
    return productoMapper.toEntity(productoRepository.save(productoMapper.toDto(producto)));
  }

}
