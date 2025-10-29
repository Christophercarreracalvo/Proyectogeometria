package com.proyecto.logica;

public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        super("Rectángulo");
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() { return ancho; }
    public double getAlto() { return alto; }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangulo)) return false;
        Rectangulo r = (Rectangulo) o;
        return Double.compare(r.ancho, ancho) == 0 && Double.compare(r.alto, alto) == 0;
    }
}
