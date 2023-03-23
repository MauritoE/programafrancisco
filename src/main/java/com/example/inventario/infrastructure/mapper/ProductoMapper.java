package com.example.inventario.infrastructure.mapper;

import com.example.inventario.domain.entities.Producto;
import com.example.inventario.infrastructure.dto.ProductoDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
  ProductoDto toDto(Producto producto);
  Producto toEntity(ProductoDto productoDto);
}
