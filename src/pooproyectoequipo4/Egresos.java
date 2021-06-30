
package pooproyectoequipo4;

import javax.swing.JOptionPane;

/**
 *
 * @author txnia
 */
public class Egresos extends Datos {
    double EgresosSemanales,EgresosMensuales, EgresosAnuales;
    
    public Egresos(String NombreEmpresa ,double ingresosdiarios, double egresosdiarios){
        super(NombreEmpresa ,ingresosdiarios,egresosdiarios);
        this.EgresosSemanales = EgresosSemanales;
        this.EgresosMensuales= EgresosMensuales;
        this.EgresosAnuales = EgresosAnuales;
    }
    public Egresos(){
        
    }
    
    public void SemanalesEgresos(int semna, double egresosdiarios) {
        
        //Para calcular los egresos Semanales
        EgresosSemanales = (semna * egresosdiarios);
        //JOptionPane.showMessageDialog(null, "Estimado de Egresos semanales: " + EgresosSemanales); //Salida para comprobar funcionamiento

    }

    public void MensualesEgresos(int menss, double egresosdiarios) {
        
        //Para calcular los egresos Mensuales
        EgresosMensuales = (menss * egresosdiarios);
        //JOptionPane.showMessageDialog(null, "Estimado de Egresos mensuales: " + EgresosMensuales); //Salida para comprobar funcionamiento

    }

    public void AnualesEgresos(int anua, double egresosdiarios) {
        
        //Para calcular los egresos Anuales
        EgresosAnuales = (anua * egresosdiarios);
        //JOptionPane.showMessageDialog(null, "Estimado de Egresos anuales: " + EgresosAnuales); //Salida para comprobar funcionamiento
        
    }
}
