package com.example.inventario.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ProductoDto {

  private String nombre;
  @Id
  private String id;
  private Integer cantidad;
  private String color;
  private String tamaño;
}
