package com.proyecto.logica;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    public double getRadio() { return radio; }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circulo)) return false;
        Circulo c = (Circulo) o;
        return Double.compare(c.radio, radio) == 0;
    }
}
