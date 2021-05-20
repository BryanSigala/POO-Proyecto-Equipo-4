
package pooproyectoequipo4;

import javax.swing.JOptionPane;


public class Datos {
    //Se declaran atributos
    protected String NombreEmpresa;
    protected double ingresosdiarios, egresosdiarios;
    
    public Datos() {
        this.NombreEmpresa = NombreEmpresa;
        this.ingresosdiarios = ingresosdiarios;
        this.egresosdiarios = egresosdiarios;
    }

    public void PedirDatos () {
        NombreEmpresa = JOptionPane.showInputDialog("Ingrese el Nombre de su empresa: ");
        ingresosdiarios = Double.parseDouble(JOptionPane.showInputDialog("¿Cuántos son los 'ingresos' diarios en su empresa? "));
        egresosdiarios = Double.parseDouble(JOptionPane.showInputDialog("¿Cuántos son los 'egresos' diarios en su empresa? "));
        System.out.println("Nombre de la empresa:" +NombreEmpresa+"\n"+"Ingresos diarios: "+ ingresosdiarios +"\n"+"Egresos diarios: "+egresosdiarios); //Salida de consola para comprobar si funciona bien el codigo
        
    }
   
    
}
