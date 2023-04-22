/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.example;


/**
 * 
 * @author James Gramajo 
 */
public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    double calcularArea() {
        //area=b*a /2
        this.setArea( (base*altura)/2);
        return this.getArea();
    }
    
}
