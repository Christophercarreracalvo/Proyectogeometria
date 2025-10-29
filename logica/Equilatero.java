package com.proyecto.logica;

public class Equilatero extends Triangulo {
    public Equilatero(double lado) {
        super(lado, lado, lado);
    }

    @Override
    public String toString() {
        return String.format("Triángulo Equilátero (lado=%.4f) (Área=%.4f, Perímetro=%.4f)", a, calcularArea(), calcularPerimetro());
    }
}
