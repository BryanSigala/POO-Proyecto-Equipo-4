/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_figuras;

/**
 *
 * @author equipo 4
 * 
 */
public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
    this.base=base;
    this.altura=altura;
    
    }
    
    public double calcularPerimetro(){
    return(base*2+altura*2);
    }
    public double calcularArea(){
    return (base*altura);
    
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
