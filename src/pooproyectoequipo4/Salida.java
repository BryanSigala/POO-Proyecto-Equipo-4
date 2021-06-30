package pooproyectoequipo4;

import javax.swing.JOptionPane;

public class Salida extends Datos{
    
    public Salida(String NombreEmpresa ,double ingresosdiarios, double egresosdiarios){
        super(NombreEmpresa ,ingresosdiarios,egresosdiarios);
    }
    public Salida(){
        
    }
    
    Ingresos ingreso = new Ingresos();
    Egresos egreso = new Egresos();
    
    public void SalidaResultados(double ingresosdiarios, double egresosdiarios, String NombreEmpresa){
        
        //Llamar a las clases para los calculos
        ingreso.Semanales(7, ingresosdiarios);
        ingreso.Mensuales(30, ingresosdiarios);
        ingreso.Anuales(365, ingresosdiarios);
        egreso.SemanalesEgresos(7, egresosdiarios);
        egreso.MensualesEgresos(30, egresosdiarios);
        egreso.AnualesEgresos(365, egresosdiarios);
        //Salida en JOption para los resultados
        JOptionPane.showMessageDialog(null, "Reporte de flujos de dinero de '" + NombreEmpresa + "' .-\n"
                + "\nIngresos semanales: $" + ingreso.Ingresos_Semanales
                + "\nIngresos mensuales: $" + ingreso.Ingresos_Mensuales
                + "\nIngresos Anuales:   $" + ingreso.Ingresos_Anuales
                + "\n"
                + "\nEgresos Semanales: $" + egreso.EgresosSemanales
                + "\nEgresos Mensuales: $" + egreso.EgresosMensuales
                + "\nEgresos Anuales:   $" + egreso.EgresosAnuales, "Reporte", JOptionPane.INFORMATION_MESSAGE);
        
}
    
}
