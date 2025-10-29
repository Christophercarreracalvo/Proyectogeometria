package com.proyecto.logica;

public class Cuadrado extends Rectangulo {
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Cuadrado (lado=" + getAncho() + ") Área=" + calcularArea() + " Perímetro=" + calcularPerimetro());
    }

    @Override
    public String toString() {
        return String.format("Cuadrado (lado=%.4f) (Área=%.4f, Perímetro=%.4f)", getAncho(), calcularArea(), calcularPerimetro());
    }
}
