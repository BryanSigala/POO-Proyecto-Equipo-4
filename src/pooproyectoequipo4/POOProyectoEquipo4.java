package pooproyectoequipo4;


/**
* @Equipo 4, POO
* Bryan Aaron Sigala Jaime
* Ana Cristina Valenzuela Ruiz
* Dianelly Amaya Vega
* Edwin Santos Marquez
* Tania Jaqueline Ramirez Ramos
* Marco Antonio Ortega Sarmiento
* Brandon Isaac Leyva Gonzalez
*/
public class POOProyectoEquipo4 {

    
    public static void main(String[] args) {
        
        
        //Aqui mandamos a llamar todo
        Datos datos = new Datos();
        datos.PedirDatos();
        
       Ingresos Totales= new Ingresos();
       Totales.Semanales(7,datos.ingresosdiarios);
       Totales.Mensuales(30, datos.ingresosdiarios);
       Totales.Anuales(365, datos.ingresosdiarios);
    
    }
    
}
