package com.example.inventario.infrastructure.adapter;

import com.example.inventario.domain.entities.Cliente;
import com.example.inventario.domain.service.ClienteGetService;
import com.example.inventario.infrastructure.client.ClienteClient;
import com.example.inventario.infrastructure.mapper.ClienteMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteGetAdapter implements ClienteGetService {
  private final ClienteMapper clienteMapper;
  private final ClienteClient clienteClient;
  public Cliente getCliente(String documento){
    return clienteMapper.toClienteEntity(clienteClient.getCliente(documento));
  }
}
