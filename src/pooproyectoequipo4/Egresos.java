/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproyectoequipo4;

import javax.swing.JOptionPane;

/**
 *
 * @author txnia
 */
public class Egresos extends Datos {
    public void SemanalesEgresos(int semna, double egresosdiarios) {

        double EgresosSemanales = (semna * egresosdiarios);
        JOptionPane.showMessageDialog(null, "Estimado de Egresos semanales: " + EgresosSemanales);

    }

    public void MensualesEgresos(int menss, double egresosdiarios) {

        double EgresosMensuales = (menss * egresosdiarios);
        JOptionPane.showMessageDialog(null, "Estimado de Egresos mensuales: " + EgresosMensuales);

    }

    public void AnualesEgresos(int anua, double egresosdiarios) {

        double EgresosAnuales = (anua * egresosdiarios);
        JOptionPane.showMessageDialog(null, "Estimado de Egresos anuales: " + EgresosAnuales);
    }
}
