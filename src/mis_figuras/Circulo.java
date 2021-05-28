/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_figuras;


public class Circulo extends Figura {
    private double radio;
    public Circulo(double radio){
    this.radio=radio;
    }
    public double calcularPerimetro(){
    return (2*Math.PI*radio);
    
    }
    public double calcularArea(){
    return Math.PI*(radio*radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
