package com.proyecto.logica;

public class Escaleno extends Triangulo {
    public Escaleno(double a, double b, double c) {
        super(a,b,c);
    }

    @Override
    public String toString() {
        return String.format("Triángulo Escaleno (a=%.4f,b=%.4f,c=%.4f) (Área=%.4f, Perímetro=%.4f)", a,b,c, calcularArea(), calcularPerimetro());
    }
}
