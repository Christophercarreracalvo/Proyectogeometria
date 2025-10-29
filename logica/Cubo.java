package com.proyecto.logica;

public class Cubo extends Cuerpo {
    private Cuadrado base;

    public Cubo(double lado) {
        super("Cubo");
        this.base = new Cuadrado(lado);
    }

    public Cuadrado getBase() { return base; }

    @Override
    public double calcularVolumen() {
        double lado = base.getAncho();
        return Math.pow(lado, 3);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(String.format("Cubo (lado=%.4f) Volumen=%.4f Área base=%.4f Perímetro base=%.4f", base.getAncho(), calcularVolumen(), base.calcularArea(), base.calcularPerimetro()));
    }
}
