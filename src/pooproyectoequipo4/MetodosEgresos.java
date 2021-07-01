
package pooproyectoequipo4;

/**
 *
 * @author EdwinSantosM
 */
public interface MetodosEgresos {//Inicio de interfaz MetodosEgresos que se implementara en la clase abstracta ProyectoPOO
    
    //Se delcaran los metodos a usar para los calculos de egresos
    public void SemanalesEgresos(int semna, double egresosdiarios);
    public void MensualesEgresos(int menss, double egresosdiarios);
    public void AnualesEgresos(int anua, double egresosdiarios);
    
} //Fin de interfaz MetodosEgresos
