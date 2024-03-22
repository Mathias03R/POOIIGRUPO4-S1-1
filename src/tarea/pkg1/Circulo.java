/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg1;

/**
 *
 * @author Usuario
 */
public class Circulo {
    private double radio;
    private String color;

    Circulo() {
        this.radio = 12.5;
        this.color = "azul";
    }

    Circulo(double radio) {
        this.radio = radio;
        this.color = "azul";
    }

    double getRadio() {
        return this.radio;
    }

    double getArea() {
        return this.radio * this.radio * Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }
}
