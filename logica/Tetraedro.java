package com.proyecto.logica;

public class Tetraedro extends Cuerpo {
    private Equilatero cara;

    public Tetraedro(double lado) {
        super("Tetraedro");
        this.cara = new Equilatero(lado);
    }

    public Equilatero getCara() { return cara; }

    @Override
    public double calcularVolumen() {
        double a = cara.a; // lado
        return Math.pow(a,3) / (6 * Math.sqrt(2));
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(String.format("Tetraedro (lado=%.4f) Volumen=%.4f", cara.a, calcularVolumen()));
    }
}
