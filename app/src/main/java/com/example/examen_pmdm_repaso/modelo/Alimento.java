package com.example.examen_pmdm_repaso.modelo;

public class Alimento {

    private String nombre;
    private float nKal;

    public Alimento(String nombre, float nKal) {
        this.nombre = nombre;
        this.nKal = nKal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getnKal() {
        return nKal;
    }

    public void setnKal(float nKal) {
        this.nKal = nKal;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nombre='" + nombre + '\'' +
                ", nKal=" + nKal +
                '}';
    }
}
