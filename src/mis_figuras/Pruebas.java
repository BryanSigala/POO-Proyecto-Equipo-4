/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_figuras;

/**
 *
 * @author equipo 4
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2.0, 4.0);
        System.out.println("Rectangulo");

        System.out.println("Rectangulo Base: " + r1.getBase() + " Altura: " + r1.getAltura() + " y el perimetro es " + r1.calcularPerimetro());

        //Area
        System.out.println("Rectangulo Base: " + r1.getBase() + " Altura: " + r1.getAltura() + " y el area es " + r1.calcularArea());

        //Circulos
        Circulo c1 = new Circulo(2);
        System.out.println("Circulos\n");
        System.out.println("Circulo radio; " + c1.getRadio());
        System.out.println("Circulo Perimetro: " + c1.calcularPerimetro());
        System.out.println("Area: " + c1.calcularArea());

    }
}
