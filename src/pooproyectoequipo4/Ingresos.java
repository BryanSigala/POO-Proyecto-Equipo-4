package pooproyectoequipo4;

import javax.swing.JOptionPane;

/**
 *
 * @author anacr
 */ 
public class Ingresos extends Datos{//Inicio de clase Ingresos que hereda de la clase Datos

    
    //Constructores de la clase Ingresos
    public Ingresos(String NombreEmpresa ,double ingresosdiarios, double egresosdiarios,
            double EgresosSemanales,double EgresosMensuales, double EgresosAnuales,
            double Ingresos_Semanales, double Ingresos_Mensuales, double Ingresos_Anuales,
            String nota, double diferencia){ //Inicia el constructor con super
        //Herencia de atributos
        super(NombreEmpresa ,ingresosdiarios,egresosdiarios, 
                EgresosSemanales,EgresosMensuales, EgresosAnuales,
                Ingresos_Semanales, Ingresos_Mensuales, Ingresos_Anuales,
                nota, diferencia);
        //Guardar memoria para atributos a usar en esta clase
        this.Ingresos_Semanales = Ingresos_Semanales;
        this.Ingresos_Mensuales = Ingresos_Mensuales;
        this.Ingresos_Anuales = Ingresos_Anuales;
    } //Termina el constructor con super
    
    public Ingresos(){
        //Constructor vacio
    }
    @Override
    public void ingresosSemanales(int Sem, double ingresosdiarios) {
        
        //Para calcular los ingresos semanales
        Ingresos_Semanales = (Sem * ingresosdiarios);
        //JOptionPane.showMessageDialog(null, "Estimado de ingresos semanales: " + Ingresos_Semanales); //Salida para comprobar funcionamiento

    }//Fin de metodo ingresosSemanales
    
    @Override
    public void ingresosMensuales(int Men, double ingresosdiarios) {
        
        //Para calcular los ingresos mensuales
        Ingresos_Mensuales = (Men * ingresosdiarios);
        //JOptionPane.showMessageDialog(null, "Estimado de ingresos mensuales: " + Ingresos_Mensuales); //Salida para comprobar funcionamiento

    }//Fin del metodo ingresosMensuales
    
    @Override
    public void ingresosAnuales(int Anuales, double Ingresos_diarios) {
        
        //Para calcular los ingresos anuales
        Ingresos_Anuales = (Anuales * Ingresos_diarios);
        //JOptionPane.showMessageDialog(null, "Estimado de ingresos anuales: " + Ingresos_Anuales); //Salida para comprobar funcionamiento
        
    }//Fin del metodo ingresosAnuales

}//Fin de la clase Ingresos
