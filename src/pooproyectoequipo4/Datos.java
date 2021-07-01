package pooproyectoequipo4;

import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * @author BryanSigala
 */
public class Datos extends ProyectoPOO { //Inicia la clase Datos que hereda de la clase abstracta ProyectoPOO

    //Constructores de la clase Datos
    public Datos(String NombreEmpresa, double ingresosdiarios, double egresosdiarios,
            double EgresosSemanales, double EgresosMensuales, double EgresosAnuales,
            double Ingresos_Semanales, double Ingresos_Mensuales, double Ingresos_Anuales,
            String nota, double diferencia) {
        //Guardar memoria para atributos a usar en esta clase
        this.NombreEmpresa = NombreEmpresa;
        this.ingresosdiarios = ingresosdiarios;
        this.egresosdiarios = egresosdiarios;

    }//Fin de constructor con atributos a heredar

    public Datos() {
        //Constructor vacio
    }

    @Override
    public void PedirDatos(){ //Metodo para la entrada de datos

        //Se pide al usuario el nombre de su empresa, y los ingresos y egresos diarios esta.
        int e = 0;
        do { //Inicio de la entrada de nombre de la empresa.
            NombreEmpresa = JOptionPane.showInputDialog("Ingrese el Nombre de su empresa: ");
            if (NombreEmpresa.equals("") && NombreEmpresa != null){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un dato valido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } while (NombreEmpresa.equals("") && NombreEmpresa != null);
        //Fin de la entrada de nombre de la empresa.
        
        do { //Inicio de la entrada de ingresos diarios.
            e = 0;
            try { //Inicio de excepcion de ingresos.
                ingresosdiarios = Double.parseDouble(JOptionPane.showInputDialog("¿Cuántos son los 'ingresos' diarios en su empresa? "));
                if(ingresosdiarios < 0){
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un valor positivo.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }catch(NumberFormatException o){
                e += 1 ;
                JOptionPane.showMessageDialog(null, "Por favor ingrese un dato valido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }//Fin de excepcion de ingresos.
        } while (e > 0 || ingresosdiarios < 0); //Fin de la entrada de ingresos diarios.
        
        do { //Inicio de la entrada de ingresos diarios.
            e = 0;
            try {//Inicio de excepcion de egresos.
                egresosdiarios = Double.parseDouble(JOptionPane.showInputDialog("¿Cuántos son los 'egresos' diarios en su empresa? "));
                if(egresosdiarios < 0){
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un valor positivo.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException o) {
                e += 1;
                JOptionPane.showMessageDialog(null, "Por favor ingrese un dato valido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }//Fin de excepcion de egresos.
        } while (e > 0 || egresosdiarios < 0); //Fin de entrada de egresos diarios
        
        //System.out.println("Nombre de la empresa:" +NombreEmpresa+"\n"+"Ingresos diarios: "+ ingresosdiarios +"\n"+"Egresos diarios: "+egresosdiarios); //Salida de consola para comprobar si funciona bien el codigo

    } //Fin de metodo PedirDatos

}//Fin de clase Datos
