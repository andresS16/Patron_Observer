/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Silva
 */
public class Preventa extends Observable {
    
    
    protected int estado ;

     public Preventa() {
     }
    
     /*public Preventa(int estado) {
        this.estado = estado;
        
    }*/
    
    
     public int getEstado(){
     return estado;
     }
    
      public void setEstado(int estado){
        this.estado=estado;
        this.notificar();      
    }
        
}
