package org.example;

abstract class Figura {
    private String color;
    private double area;

    public Figura(String color) {
        this.color = color;
    }

    abstract double calcularArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
