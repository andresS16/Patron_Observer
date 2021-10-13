
package patronobserver;

import java.util.ArrayList;
import java.util.List;


public abstract class Observable {
    
    private List<Observador>observadores = new ArrayList<Observador>();
    
    public void agregar(Observador o ){
        observadores.add(o);
         System.out.println("Observador agregado");
    }
    
    
    public void eliminar(Observador o ){
        observadores.remove(o);
            System.out.println("Observador eliminado");
    }

    public void notificar(){
        observadores.forEach(x -> x.actualizar());
        
            System.out.println("notificando observadores un nuevo cambio de estado" );     
    }
    
    
    
    /*public abstract void agregar(Observador o);
    public abstract void eliminar(Observador o);
    public abstract void notificar(Observador o);*/
    
    

}
