package org.example;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado=lado;
    }

    @Override
    double calcularArea() {

        this.setArea(lado*lado);
        return this.getArea();
    }


}
