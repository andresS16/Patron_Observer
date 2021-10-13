
package patronobserver;



public class PatronObserver {
     
    public static void main(String[] args) {
                 
         Preventa p = new Preventa();
         p.setEstado(8);  
         System.out.println("El estado de Preventa es "+ p.getEstado());
         Clientes cliente= new Clientes (p);
         //Clientes cliente1= new Clientes (p);
         
         
           
            System.out.println("----------");
            
                 /*Preventa p1 = new Preventa();
                 p1.setEstado(12);
                 System.out.println("El estado de Preventa es "+ p1.getEstado());
                 Clientes cliente1= new Clientes (p);*/
            
          
          
            
             
        
        
    }
    
}
