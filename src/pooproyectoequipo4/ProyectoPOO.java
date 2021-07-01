
package pooproyectoequipo4;

/**
 * @author Envy
 */
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
    @Override
    public void SemanalesEgresos(){
        
    }
    @Override
    public void MensualesEgresos(){
        
    }
    @Override
    public void AnualesEgresos(){
        
    }
    @Override
    public void ingresosSemanales(){
        
    }
    @Override
    public void ingresosMensuales(){
        
    }
    @Override
    public void ingresosAnuales(){
        
    }
    @Override
    public void SalidaResultados(){
        
    }
    
}
