package com.abuelos.duoc.abuelos.dto;

public class LoginRequestDto {
    String nombre;
    String clave;

    public LoginRequestDto(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    public LoginRequestDto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
