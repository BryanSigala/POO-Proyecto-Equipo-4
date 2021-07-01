
package pooproyectoequipo4;

import javax.swing.JOptionPane;
/**
*@author BryanSigala
*/

public class Datos extends ProyectoPOO { //Inicia la clase Datos que hereda de la clase abstracta ProyectoPOO
    
    //Constructores de la clase Datos
    public Datos(String NombreEmpresa, double ingresosdiarios, double egresosdiarios, 
            double EgresosSemanales,double EgresosMensuales, double EgresosAnuales,
            double Ingresos_Semanales, double Ingresos_Mensuales, double Ingresos_Anuales,
            String nota, double diferencia) {
        //Guardar memoria para atributos a usar en esta clase
        this.NombreEmpresa = NombreEmpresa;
        this.ingresosdiarios = ingresosdiarios;
        this.egresosdiarios = egresosdiarios;
        
    }//Fin de constructor con atributos a heredar
    
    public Datos(){
        //Constructor vacio
    }
    
    @Override
    public void PedirDatos () { //Metodo para la entrada de datos
        
        //Se pide al usuario el nombre de su empresa, y los ingresos y egresos diarios esta.
        NombreEmpresa = JOptionPane.showInputDialog("Ingrese el Nombre de su empresa: ");
        ingresosdiarios = Double.parseDouble(JOptionPane.showInputDialog("¿Cuántos son los 'ingresos' diarios en su empresa? "));
        egresosdiarios = Double.parseDouble(JOptionPane.showInputDialog("¿Cuántos son los 'egresos' diarios en su empresa? "));
        //System.out.println("Nombre de la empresa:" +NombreEmpresa+"\n"+"Ingresos diarios: "+ ingresosdiarios +"\n"+"Egresos diarios: "+egresosdiarios); //Salida de consola para comprobar si funciona bien el codigo
        
    } //Fin de metodo PedirDatos
   
    
}//Fin de clase Datos
