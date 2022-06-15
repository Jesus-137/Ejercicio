package com.upchiapas.Ejercicio.models;

public class Alumno {
    private int matricula; private String nombre;
    public Alumno(){}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }
}
