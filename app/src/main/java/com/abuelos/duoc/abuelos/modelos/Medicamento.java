package com.abuelos.duoc.abuelos.modelos;

public class Medicamento {
    private Long id;
    private String nombre;

    public Medicamento() {
    }

    public Medicamento(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
