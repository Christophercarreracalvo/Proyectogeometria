package com.proyecto.logica;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private List<Figura> figuras;
    private List<Cuerpo> cuerpos;

    public Coleccion() {
        figuras = new ArrayList<>();
        cuerpos = new ArrayList<>();
    }

    public void agregarFigura(Figura f) { figuras.add(f); }
    public void agregarCuerpo(Cuerpo c) { cuerpos.add(c); }

    public List<Figura> getFiguras() { return figuras; }
    public List<Cuerpo> getCuerpos() { return cuerpos; }

    public double areaTotal() {
        return figuras.stream().mapToDouble(Figura::calcularArea).sum();
    }

    public double perimetroTotal() {
        return figuras.stream().mapToDouble(Figura::calcularPerimetro).sum();
    }

    public double volumenTotal() {
        return cuerpos.stream().mapToDouble(Cuerpo::calcularVolumen).sum();
    }
}
