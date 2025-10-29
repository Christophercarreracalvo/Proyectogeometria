package com.proyecto.logica;

public class Rombo extends Figura {
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double diagonalMayor, double diagonalMenor) {
        super("Rombo");
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMayor() { return diagonalMayor; }
    public double getDiagonalMenor() { return diagonalMenor; }

    @Override
    public double calcularPerimetro() {
        double lado = Math.sqrt(Math.pow(diagonalMayor/2,2) + Math.pow(diagonalMenor/2,2));
        return 4 * lado;
    }

    @Override
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2.0;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(this.toString());
    }
}
