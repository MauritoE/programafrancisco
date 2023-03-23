package com.example.inventario.infrastructure.api.controller;

import com.example.inventario.application.ProductoGet;
import com.example.inventario.application.ProductoSave;
import com.example.inventario.domain.entities.Producto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/producto")
public class ProductoController {
  private final ProductoSave productoSave;
  private final ProductoGet productoGet;
  @PostMapping
  public ResponseEntity<Producto> addProducto(@RequestBody Producto producto) {
    return new ResponseEntity<>(productoSave.saveProducto(producto), HttpStatus.CREATED);
  }
  @GetMapping
  public ResponseEntity<Producto> getProducto(@RequestParam String id) {
    return new ResponseEntity<>(productoGet.getProducto(id), HttpStatus.OK);
  }

}
