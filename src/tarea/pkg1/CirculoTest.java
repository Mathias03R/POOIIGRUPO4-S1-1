/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg1;

/**
 *
 * @author Usuario
 */
public class CirculoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circuloPorDefecto = new Circulo();
        System.out.println("Círculo con radio por defecto:");
        System.out.println("Radio: " + circuloPorDefecto.getRadio());
        System.out.println("Área: " + circuloPorDefecto.getArea());
        System.out.println();

        Circulo circuloSobrecargado = new Circulo(6.55);
        System.out.println("Círculo con radio 6.55:");
        System.out.println("Radio: " + circuloSobrecargado.getRadio());
        System.out.println("Área: " + circuloSobrecargado.getArea());
        
        System.out.println(circuloSobrecargado.toString());
        
        Circulo c1 = new Circulo();
        
        System.out.println(c1.radius);
        
        c1.radius=42.0
        
    }

    
}
