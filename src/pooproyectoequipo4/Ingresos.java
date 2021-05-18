package pooproyectoequipo4;

import javax.swing.JOptionPane;

/**
 *
 * @author anacr
 */
public class Ingresos {

    public void Semanales(int Sem, double ingresosdiarios) {

        double Ingresos_Semanales = (Sem * ingresosdiarios);
        JOptionPane.showMessageDialog(null, "Estimado de ingresos semanales: " + Ingresos_Semanales);

    }

    public void Mensuales(int Men, double ingresosdiarios) {

        double Ingresos_Mensuales = (Men * ingresosdiarios);
        JOptionPane.showMessageDialog(null, "Estimado de ingresos mensuales: " + Ingresos_Mensuales);

    }

    public void Anuales(int Anuales, double Ingresos_diarios) {

        double Ingresos_Anuales = (Anuales * Ingresos_diarios);
        JOptionPane.showMessageDialog(null, "Estimado de ingresos anuales: " + Ingresos_Anuales);
    }

}
