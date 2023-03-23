package com.example.inventario.domain.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Producto {
  private String nombre;
  @Id
  private String id;
  private Integer cantidad;
  private String color;
  private String tamaño;
}
