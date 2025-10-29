package com.proyecto.logica;

public class Isosceles extends Triangulo {
    public Isosceles(double ladoIgual, double base) {
        super(ladoIgual, ladoIgual, base);
    }

    @Override
    public String toString() {
        return String.format("Triángulo Isósceles (lados=%.4f, base=%.4f) (Área=%.4f, Perímetro=%.4f)", a, c, calcularArea(), calcularPerimetro());
    }
}
