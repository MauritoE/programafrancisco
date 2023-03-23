package com.example.inventario.infrastructure.adapter;

import com.example.inventario.domain.entities.Producto;
import com.example.inventario.domain.service.ProductoGetService;
import com.example.inventario.infrastructure.dto.ProductoDto;
import com.example.inventario.infrastructure.repository.ProductoRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoGetAdapter implements ProductoGetService {

  private final ProductoRepository productoRepository;
  public Producto getProducto(String id){
    Optional<ProductoDto> productoDto = productoRepository.findById(id);
    return productoDto.map(this::buildProducto).orElse(null);
  }

  public Producto buildProducto(ProductoDto producto){
    return new Producto(producto.getNombre(),producto.getId(),producto.getCantidad(),producto.getColor(),producto.getTamaño());
  }
}
