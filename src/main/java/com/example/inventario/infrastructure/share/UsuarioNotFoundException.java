package com.example.inventario.infrastructure.share;

import org.springframework.http.HttpStatus;

public class UsuarioNotFoundException extends BaseException{
  public UsuarioNotFoundException (String message){
    super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.USUARIO_NOT_FOUND);
  }

}
