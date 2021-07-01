
package pooproyectoequipo4;

/**
 * @author BryanSigala
 */
//Inicio de clase abstracta ProyectoPOO que se implementan las interfaces de MetodosDatos,MetodosIngresos,MetodosEgresos
public abstract class ProyectoPOO implements MetodosDatos,MetodosIngresos,MetodosEgresos { 
    
    //Delaracion de todos los atributos que se usan en el programa
    protected String NombreEmpresa, nota;
    protected double ingresosdiarios, egresosdiarios, 
            EgresosSemanales,EgresosMensuales, EgresosAnuales,
            Ingresos_Semanales, Ingresos_Mensuales, Ingresos_Anuales,
            diferencia;
    
    
    //Declaracion de metodos que se usaran en todo el programa
    @Override
    public void PedirDatos(){
        
    }
    //Fin de metodo de clase Datos
    
    @Override
    public void SemanalesEgresos(int semna, double egresosdiarios){
        
    }
    
    @Override
    public void MensualesEgresos(int menss, double egresosdiarios){
        
    }
    
    @Override
    public void AnualesEgresos(int anua, double egresosdiarios){
        
    }
    //Fin de metodos de clase Egresos
    
    @Override
    public void ingresosSemanales(int Sem, double ingresosdiarios){
        
    }
    
    @Override
    public void ingresosMensuales(int Men, double ingresosdiarios){
        
    }
    
    @Override
    public void ingresosAnuales(int Anuales, double ingresosdiarios){
        
    }
    //Fin de metodos de clase Ingresos
    
    @Override
    public void SalidaResultados(){
        
    }
    //Fin de metodos de clase Salida
    
}//Fin de clase abstracta ProyectoPOO
