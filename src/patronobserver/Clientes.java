

package patronobserver;


public class Clientes implements Observador{

   protected  Preventa preventa;
   protected int estado;

    
    
    public Clientes(Preventa preventa){
        this.preventa =preventa;
        this.preventa.agregar(this);
        actualizar();
    
    }

    @Override
    public void actualizar( ) {
        if(preventa.getEstado() > 5){
         System.out.println("Ingreso valor > 5 .Actualizacion de estado clientes " );
         actualizacionEstadoCliente();
        }
        
    }
    
    public void actualizacionEstadoCliente(){
    
        System.out.println("ACCEDE AL DESCUENTO DE 10% CONTRATANDO EL SERVICIO PREMIUM" ); 
    }
    
}
