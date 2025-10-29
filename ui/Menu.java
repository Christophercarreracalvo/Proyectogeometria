package com.proyecto.ui;

import com.proyecto.logica.*;
import java.util.Scanner;

public class Menu {
    private Coleccion coleccion;
    private Scanner sc;

    public Menu() {
        coleccion = new Coleccion();
        sc = new Scanner(System.in);
    }

    public void mostrar() {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n Menú Colección Geométrica ");
            System.out.println("1. Agregar figura");
            System.out.println("2. Agregar cuerpo");
            System.out.println("3. Listar figuras");
            System.out.println("4. Listar cuerpos");
            System.out.println("5. Área total");
            System.out.println("6. Perímetro total");
            System.out.println("7. Volumen total");
            System.out.println("8. Salir");
            System.out.print("Elija una opción: ");
            int opt = Integer.parseInt(sc.nextLine());
            switch (opt) {
                case 1: agregarFigura(); break;
                case 2: agregarCuerpo(); break;
                case 3: listarFiguras(); break;
                case 4: listarCuerpos(); break;
                case 5: System.out.println("Área total = " + coleccion.areaTotal()); break;
                case 6: System.out.println("Perímetro total = " + coleccion.perimetroTotal()); break;
                case 7: System.out.println("Volumen total = " + coleccion.volumenTotal()); break;
                case 8: salir = true; break;
                default: System.out.println("Opción inválida");
            }
        }
        System.out.println("Saliendo... Gracias por usar este programa.");
    }

    private void agregarFigura() {
        System.out.println("Tipos: 1-Círculo 2-Rectángulo 3-Cuadrado 4-Rombo 5-Triángulo");
        System.out.print("Elija tipo: ");
        int t = Integer.parseInt(sc.nextLine());
        try {
            switch (t) {
                case 1:
                    System.out.print("Radio: "); double r = Double.parseDouble(sc.nextLine());
                    coleccion.agregarFigura(new Circulo(r)); break;
                case 2:
                    System.out.print("Ancho: "); double an = Double.parseDouble(sc.nextLine());
                    System.out.print("Alto: "); double al = Double.parseDouble(sc.nextLine());
                    coleccion.agregarFigura(new Rectangulo(an, al)); break;
                case 3:
                    System.out.print("Lado: "); double lado = Double.parseDouble(sc.nextLine());
                    coleccion.agregarFigura(new Cuadrado(lado)); break;
                case 4:
                    System.out.print("Diagonal mayor: "); double dm = Double.parseDouble(sc.nextLine());
                    System.out.print("Diagonal menor: "); double dn = Double.parseDouble(sc.nextLine());
                    coleccion.agregarFigura(new Rombo(dm, dn)); break;
                case 5:
                    System.out.print("Lado a: "); double a = Double.parseDouble(sc.nextLine());
                    System.out.print("Lado b: "); double b = Double.parseDouble(sc.nextLine());
                    System.out.print("Lado c: "); double c = Double.parseDouble(sc.nextLine());
                    coleccion.agregarFigura(crearTrianguloSegunLados(a,b,c)); break;
                default:
                    System.out.println("Tipo inválido");
            }
            System.out.println("Figura agregada.");
        } catch (Exception e) {
            System.out.println("Error al crear figura: " + e.getMessage());
        }
    }

    private Figura crearTrianguloSegunLados(double a, double b, double c) {
        // Determine type by side equality
        if (Math.abs(a-b) < 1e-9 && Math.abs(b-c) < 1e-9) return new Equilatero(a);
        if (Math.abs(a-b) < 1e-9 || Math.abs(a-c) < 1e-9 || Math.abs(b-c) < 1e-9) {
            // which is base?
            if (Math.abs(a-b) < 1e-9) return new Isosceles(a, c);
            if (Math.abs(a-c) < 1e-9) return new Isosceles(a, b);
            return new Isosceles(b, a);
        }
        return new Escaleno(a,b,c);
    }

    private void agregarCuerpo() {
        System.out.println("Tipos: 1-Cubo 2-Cilindro 3-Tetraedro 4-Esfera");
        System.out.print("Elija tipo: ");
        int t = Integer.parseInt(sc.nextLine());
        try {
            switch (t) {
                case 1:
                    System.out.print("Lado: "); double lado = Double.parseDouble(sc.nextLine());
                    coleccion.agregarCuerpo(new Cubo(lado)); break;
                case 2:
                    System.out.print("Radio: "); double r = Double.parseDouble(sc.nextLine());
                    System.out.print("Altura: "); double h = Double.parseDouble(sc.nextLine());
                    coleccion.agregarCuerpo(new Cilindro(r,h)); break;
                case 3:
                    System.out.print("Lado (triángulo equilátero): "); double la = Double.parseDouble(sc.nextLine());
                    coleccion.agregarCuerpo(new Tetraedro(la)); break;
                case 4:
                    System.out.print("Radio: "); double re = Double.parseDouble(sc.nextLine());
                    coleccion.agregarCuerpo(new Esfera(re)); break;
                default:
                    System.out.println("Tipo inválido");
            }
            System.out.println("Cuerpo agregado.");
        } catch (Exception e) {
            System.out.println("Error al crear cuerpo: " + e.getMessage());
        }
    }

    private void listarFiguras() {
        System.out.println("Figuras");
        for (Figura f : coleccion.getFiguras()) {
            f.imprimirInformacion();
        }
    }

    private void listarCuerpos() {
        System.out.println("Cuerpos");
        for (Cuerpo c : coleccion.getCuerpos()) {
            c.imprimirInformacion();
        }
    }
}
