package pooproyectoequipo4;

import javax.swing.JOptionPane;
/*
**@author Brandon Leyva, Marco Ortega
*/
public class Salida extends Datos{
    
    double diferencia;
    String nota;
    
    public Salida(String NombreEmpresa ,double ingresosdiarios, double egresosdiarios){
        super(NombreEmpresa ,ingresosdiarios,egresosdiarios);
        this.diferencia = diferencia;
        this.nota = nota;
    }
    public Salida(){
        
    }
    
    //Llamar a las clases para los calculos
    Ingresos ingreso = new Ingresos();
    Egresos egreso = new Egresos();
    
    public void SalidaResultados(double ingresosdiarios, double egresosdiarios, String NombreEmpresa){
        nota = "";
        //Llamar a los metodos de los calculos
        ingreso.ingresosSemanales(7, ingresosdiarios);
        ingreso.ingresosMensuales(30, ingresosdiarios);
        ingreso.ingresosAnuales(365, ingresosdiarios);
        egreso.SemanalesEgresos(7, egresosdiarios);
        egreso.MensualesEgresos(30, egresosdiarios);
        egreso.AnualesEgresos(365, egresosdiarios);
        
        //Calculo para averiguar si hubo perdida o ganacia durante el año
        diferencia = ingreso.Ingresos_Anuales - egreso.EgresosAnuales;
        if(diferencia > 0){
            nota += "Tuvo ganancia de: $" + diferencia + " en el año.";
        }else if(diferencia < 0){
            nota += "Tuvo pérdida de: $" + (diferencia*(-1)) + " en el año.";
        }else if(diferencia == 0){
            nota += "No hubo ganancia ni pérdida durante el año.";
        }
        
        //Salida en JOption para los resultados
        JOptionPane.showMessageDialog(null, "Reporte de flujos de dinero de '" + NombreEmpresa + "' .-\n"
                + "\nIngresos semanales: $" + ingreso.Ingresos_Semanales
                + "\nIngresos mensuales: $" + ingreso.Ingresos_Mensuales
                + "\nIngresos Anuales:   $" + ingreso.Ingresos_Anuales
                + "\n"
                + "\nEgresos Semanales: $" + egreso.EgresosSemanales
                + "\nEgresos Mensuales: $" + egreso.EgresosMensuales
                + "\nEgresos Anuales:   $" + egreso.EgresosAnuales
                + "\n\n"
                + nota, "Reporte", JOptionPane.INFORMATION_MESSAGE);
        
}
    
}
