package com.proyecto.logica;

public abstract class Figura implements Forma {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figura)) return false;
        Figura f = (Figura) o;
        return nombre != null ? nombre.equals(f.nombre) : f.nombre == null;
    }

    @Override
    public String toString() {
        return String.format("%s (Área=%.4f, Perímetro=%.4f)", nombre, calcularArea(), calcularPerimetro());
    }
}
