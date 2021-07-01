package pooproyectoequipo4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
**@author Brandon Leyva, Marco Ortega
*/
public class Salida extends Datos{ //Inicio de clase Salida que hereda de la clase Datos
    
    //Constructores de la clase Salida
    public Salida(String NombreEmpresa ,double ingresosdiarios, double egresosdiarios,
            double EgresosSemanales,double EgresosMensuales, double EgresosAnuales,
            double Ingresos_Semanales, double Ingresos_Mensuales, double Ingresos_Anuales,
            String nota, double diferencia){ //Inicia constructor con super
        //Herencia de atributos
        super(NombreEmpresa ,ingresosdiarios,egresosdiarios, 
                EgresosSemanales,EgresosMensuales, EgresosAnuales,
                Ingresos_Semanales, Ingresos_Mensuales, Ingresos_Anuales,
                nota, diferencia);
        //Guardar memoria para atributos a usar en esta clase
        this.diferencia = diferencia;
        this.nota = nota;
    } //Termina el constructor con super
    
    public Salida(){
        //Constructor vacio
    }
    
    //Llamar a las clases para los calculos
    Ingresos ingreso = new Ingresos();
    Egresos egreso = new Egresos();
    
    public void SalidaResultados(double ingresosdiarios, double egresosdiarios, String NombreEmpresa){
        nota = "";
        //Llamar a los metodos de los calculos de ingresos y egresos
        ingreso.ingresosSemanales(7, ingresosdiarios);
        ingreso.ingresosMensuales(30, ingresosdiarios);
        ingreso.ingresosAnuales(365, ingresosdiarios);
        egreso.SemanalesEgresos(7, egresosdiarios);
        egreso.MensualesEgresos(30, egresosdiarios);
        egreso.AnualesEgresos(365, egresosdiarios);
        
        //Calculo para averiguar si hubo perdida o ganacia durante el año
        diferencia = ingreso.Ingresos_Anuales - egreso.EgresosAnuales; //Se resta lo que ingreso en el año menos lo que egreso durante el año.
        
        //Condicion para averiguar si el ingreso fue mayor a lo ganado, o viceversa.
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
        
        //Se crea el archivo .txt con los resultados
        File file = new File("Reporte de flujo de dinero.txt");{ //Inicia ejecucion de creacion o edicion de un archivo txt con los resultados mostrados.
        try { //Inicia el bloque de excepcion.
            boolean fileCreated = file.createNewFile();
            FileWriter filewriter = new FileWriter(file); //Para escribir los resultados sobre el archivo txt.
            filewriter.write("___ROUND BUSINESS 2021___"+"\n"+"\n"+"Reporte de flujos de dinero de la empresa: "+"\n"
                    +"** "+ NombreEmpresa +" **"+"\n"
                    +"\nIngresos semanales: $" + ingreso.Ingresos_Semanales 
                    + "\nIngresos mensuales: $" + ingreso.Ingresos_Mensuales
                    + "\nIngresos Anuales:   $" + ingreso.Ingresos_Anuales
                    + "\n"
                            + "\nEgresos Semanales: $" + egreso.EgresosSemanales
                    + "\nEgresos Mensuales: $" + egreso.EgresosMensuales
                    + "\nEgresos Anuales:   $" + egreso.EgresosAnuales
                    + "\n\n"+ nota+"\n"+"\n"+"OJO: Estos datos son reales solo si los ingresos y egresos diarios se mantienen iguales.");
            filewriter.close();
            if(fileCreated){ //Mensaje a mostrar en caso de que se creara un archivo con los resultados.
                JOptionPane.showMessageDialog(null, "El archivo se creo correctamente."
                        + "\nEl reporte de resultados ha sido guardado en el archivo: ......... " + file.getName()
                        + "\nLa ruta de guardado de los resultados es: \n" + file.getAbsolutePath()
                        + "\n\nPuede cambiar el nombre del archivo o moverlo de lugar. \n Buen día.", "Resultados guardados", JOptionPane.INFORMATION_MESSAGE);
            }else{ //Mensaje  a mostrar en caso de que el archivo ya existiera y que fue editado su contenido con los nuevos resultados.
                JOptionPane.showMessageDialog(null, "Los resultados se llevaron a un archivo que ya existía y su contenido ha sido modificado con los resultados actuales."
                        + "\nEl reporte de resultados ha sido guardado en el archivo: ......... " + file.getName()
                        + "\nLa ruta de guardado de los resultados es: \n" + file.getAbsolutePath()
                        + "\n\nPuede cambiar el nombre del archivo o moverlo de lugar. \n Buen día.", "Resultados guardados", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(Salida.class.getName()).log(Level.SEVERE, null, ex);
        } //Termina el bloque de excepcion.
    }//Fin de ejecucion para la creacion o edicion de archivo txt.
        
} //Fin del metodo SalidaResultados.
    
} //Fin de la clase Salida
