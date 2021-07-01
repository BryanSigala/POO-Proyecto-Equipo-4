
package pooproyectoequipo4;

import javax.swing.JOptionPane;

/**
 *
 * @author txnia
 */
public class Egresos extends Datos { //Inicia clase Egresos que hereda de la clase Datos
    
    //Constructores de la clase Egresos
    public Egresos(String NombreEmpresa ,double ingresosdiarios, double egresosdiarios,
            double EgresosSemanales,double EgresosMensuales, double EgresosAnuales,
            double Ingresos_Semanales, double Ingresos_Mensuales, double Ingresos_Anuales,
            String nota, double diferencia){ //Inicia constructor con super
        //Herencia de atributos
        super(NombreEmpresa ,ingresosdiarios,egresosdiarios, 
                EgresosSemanales,EgresosMensuales, EgresosAnuales,
                Ingresos_Semanales, Ingresos_Mensuales, Ingresos_Anuales,
                nota, diferencia);
        //Guardar memoria para atributos a usar en esta clase
        this.EgresosSemanales = EgresosSemanales;
        this.EgresosMensuales= EgresosMensuales;
        this.EgresosAnuales = EgresosAnuales;
    } //Fin de constructor con super
    
    public Egresos(){
     //Constructor vacio   
    }
    
    @Override
    public void SemanalesEgresos(int semna, double egresosdiarios) {
        
        //Para calcular los egresos Semanales
        EgresosSemanales = (semna * egresosdiarios);
        //JOptionPane.showMessageDialog(null, "Estimado de Egresos semanales: " + EgresosSemanales); //Salida para comprobar funcionamiento

    }//SemanalesEgresos
    
    @Override
    public void MensualesEgresos(int menss, double egresosdiarios) {
        
        //Para calcular los egresos Mensuales
        EgresosMensuales = (menss * egresosdiarios);
        //JOptionPane.showMessageDialog(null, "Estimado de Egresos mensuales: " + EgresosMensuales); //Salida para comprobar funcionamiento

    }//Fin del metodo MensualesEgresos
    
    @Override
    public void AnualesEgresos(int anua, double egresosdiarios) {
        
        //Para calcular los egresos Anuales
        EgresosAnuales = (anua * egresosdiarios);
        //JOptionPane.showMessageDialog(null, "Estimado de Egresos anuales: " + EgresosAnuales); //Salida para comprobar funcionamiento
        
    }//Fin del metodo AnualesEgresos
    
}//Fin de la clase Egresos
