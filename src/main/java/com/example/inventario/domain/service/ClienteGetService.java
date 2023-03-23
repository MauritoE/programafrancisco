package com.example.inventario.domain.service;

import com.example.inventario.domain.entities.Cliente;

public interface ClienteGetService {
  Cliente getCliente(String documento);
}
