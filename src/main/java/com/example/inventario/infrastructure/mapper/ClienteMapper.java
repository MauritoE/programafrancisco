package com.example.inventario.infrastructure.mapper;

import com.example.inventario.domain.entities.Cliente;
import com.example.inventario.infrastructure.client.ClienteResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
  Cliente toClienteEntity(ClienteResponse clienteResponse);
  ClienteResponse toClienteResponse(Cliente cliente);
}
