package org.example;

public class Circulo extends Figura{
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio=radio;
    }

    @Override
    double calcularArea() {
        double pi=Math.PI;
        double radioCuadrado=Math.pow(radio,2);

        this.setArea(  pi*radioCuadrado);
        return this.getArea();
    }
}
