package com.example.inventario.domain.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Builder
public class Cliente {

  private String nombre;
  private String documento;
  private String estado;

  public Cliente(String nombre, String documento, String estado) {
    this.nombre = nombre;
    this.documento = documento;
    this.estado = estado;
  }
}
