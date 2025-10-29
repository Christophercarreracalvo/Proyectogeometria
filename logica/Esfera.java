package com.proyecto.logica;

public class Esfera extends Cuerpo {
    private double radio;

    // For Esfera, the radius can be inferred from a Circulo or provided directly.
    public Esfera(double radio) {
        super("Esfera");
        this.radio = radio;
    }

    public Esfera(Circulo circulo) {
        super("Esfera");
        this.radio = circulo.getRadio();
    }

    public double getRadio() { return radio; }

    @Override
    public double calcularVolumen() {
        return (4.0/3.0) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(String.format("Esfera (radio=%.4f) Volumen=%.4f", radio, calcularVolumen()));
    }
}
