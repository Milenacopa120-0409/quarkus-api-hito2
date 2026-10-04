package com.evaluacion.modelos;

public class Recurso {
    public Long id;
    public String nombre;
    public String descripcion;
    
    public Recurso() {}
    
    public Recurso(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
