package pooproyectoequipo4;

import javax.swing.JOptionPane;

/**
 *
 * @author anacr
 */ 
public class Ingresos extends Datos{

    double Ingresos_Semanales, Ingresos_Mensuales, Ingresos_Anuales;
    
    public Ingresos(String NombreEmpresa ,double ingresosdiarios, double egresosdiarios){
        super(NombreEmpresa ,ingresosdiarios,egresosdiarios);
        this.Ingresos_Semanales = Ingresos_Semanales;
        this.Ingresos_Mensuales = Ingresos_Mensuales;
        this.Ingresos_Anuales = Ingresos_Anuales;
    }
    public Ingresos(){
        
    }
    
    public void Semanales(int Sem, double ingresosdiarios) {
        
        //Para calcular los ingresos semanales
        Ingresos_Semanales = (Sem * ingresosdiarios);
        //JOptionPane.showMessageDialog(null, "Estimado de ingresos semanales: " + Ingresos_Semanales); //Salida para comprobar funcionamiento

    }

    public void Mensuales(int Men, double ingresosdiarios) {
        
        //Para calcular los ingresos mensuales
        Ingresos_Mensuales = (Men * ingresosdiarios);
        //JOptionPane.showMessageDialog(null, "Estimado de ingresos mensuales: " + Ingresos_Mensuales); //Salida para comprobar funcionamiento

    }

    public void Anuales(int Anuales, double Ingresos_diarios) {
        
        //Para calcular los ingresos anuales
        Ingresos_Anuales = (Anuales * Ingresos_diarios);
        //JOptionPane.showMessageDialog(null, "Estimado de ingresos anuales: " + Ingresos_Anuales); //Salida para comprobar funcionamiento
    }

}
