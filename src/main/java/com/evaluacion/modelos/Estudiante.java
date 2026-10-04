package com.evaluacion.modelos;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private String password;
    private int telefono;

    public Estudiante() {
        id = 0;
        nombre = "NA";
        apellido = "NN";
        password = "NN";
        telefono = 0;
    }

    public Estudiante(int id, String nombre, String apellido, String password, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.telefono = telefono;
    }
}