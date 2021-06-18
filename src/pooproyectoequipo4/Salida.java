package pooproyectoequipo4;

import javax.swing.JOptionPane;

public class Salida {
    
    
    public void Ingresos(){
        
        Datos datos = new Datos();
        datos.PedirDatos();

        JOptionPane.showMessageDialog(null, "Ingresos semanales ");
        Ingresos Semana= new Ingresos();
        Semana.Semanales(7, datos.ingresosdiarios);
        JOptionPane.showMessageDialog(null, "Ingresos mensuales ");
        Ingresos Mes=new Ingresos();
        Mes.Mensuales(30, datos.ingresosdiarios);
        JOptionPane.showMessageDialog(null, "Ingresos anuales ");
        Ingresos Año=new Ingresos();
        Año.Anuales(365, datos.ingresosdiarios);
        
        
}
    
    public void Egresos(){
        
        Datos datos = new Datos();
        datos.PedirDatos();

        JOptionPane.showMessageDialog(null, "Egresos semanales ");
        Egresos Semanal= new Egresos();
        Semanal.SemanalesEgresos(7, datos.egresosdiarios);
        JOptionPane.showMessageDialog(null, "Egresos mensuales ");
        Egresos Mensual=new Egresos();
        Mensual.MensualesEgresos(30, datos.egresosdiarios);
        JOptionPane.showMessageDialog(null, "Egresos anuales ");
        Egresos Anual=new Egresos();
        Anual.AnualesEgresos(365, datos.egresosdiarios);
 }
}
