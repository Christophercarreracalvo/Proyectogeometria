package com.proyecto.logica;

public class Cilindro extends Cuerpo {
    private Circulo base;
    private double altura;

    public Cilindro(double radio, double altura) {
        super("Cilindro");
        this.base = new Circulo(radio);
        this.altura = altura;
    }

    public Circulo getBase() { return base; }
    public double getAltura() { return altura; }

    @Override
    public double calcularVolumen() {
        return base.calcularArea() * altura;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(String.format("Cilindro (radio=%.4f, altura=%.4f) Volumen=%.4f", base.getRadio(), altura, calcularVolumen()));
    }
}
