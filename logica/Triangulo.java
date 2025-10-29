package com.proyecto.logica;

public abstract class Triangulo extends Figura {
    protected double a, b, c;

    public Triangulo(double a, double b, double c) {
        super("Triángulo");
        this.a = a; this.b = b; this.c = c;
    }

    @Override
    public double calcularPerimetro() {
        return a + b + c;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro()/2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(this.toString());
    }
}
