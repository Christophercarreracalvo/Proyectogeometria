package com.proyecto.logica;

public abstract class Cuerpo {
    private String nombre;

    public Cuerpo(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    public abstract double calcularVolumen();
    public abstract void imprimirInformacion();

    @Override
    public String toString() {
        return String.format("%s (Volumen=%.4f)", nombre, calcularVolumen());
    }
}
