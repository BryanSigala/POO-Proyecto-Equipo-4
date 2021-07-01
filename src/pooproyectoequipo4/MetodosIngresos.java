
package pooproyectoequipo4;

/**
 *
 * @author EdwinSantosM
 */
public interface MetodosIngresos {//Inicio de interfaz MetodosIngresos que se implementara en la clase abstracta ProyectoPOO
    
    //Se declaran los metodos para el calculo de los ingresos
    public void ingresosSemanales(int Sem, double ingresosdiarios);
    public void ingresosMensuales(int Men, double ingresosdiarios);
    public void ingresosAnuales(int Anuales, double ingresosdiarios);
    
} //Fin de interfaz MetodosIngresos
