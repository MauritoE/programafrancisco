package com.example.inventario.infrastructure.share;

public enum ExceptionCode {
  NOT_CONTROLLED("BAS-001","RESOURCE_FILE_NOT_FOUND"),
  RESOURCE_FILE_NOT_FOUND("COR_013","RESOURCE_FILE_NOT FOUND"),
  USUARIO_NOT_FOUND("COR_231", "USUARIO_NOT_FOUND");
  private final String code;
  private final String type;

  ExceptionCode(String code, String type){
    this.code = code;
    this.type = type;
  }

  public String getCode() {
    return code;
  }

  public String getType() {
    return type;
  }
}

