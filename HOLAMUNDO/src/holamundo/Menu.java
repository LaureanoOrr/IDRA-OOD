package holamundo;

import java.util.concurrent.TimeUnit;


public class Menu {
     
   protected Consola teclado;
   protected Persona arregloGente[];
   protected int cantGente = 0;
   
   public Menu()
   {
       this.teclado = new Consola();
      arregloGente = new Persona[10];
      cantGente = 0;
   }
   
   
    public void MostrarMenu() throws InterruptedException 
    {
    int opcion;
        do {  
    
    System.out.println("Bievenido al menu de la agenda. A continuación se le mostraran las opciones correspondientes.");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("Opción 1: Ingresar datos de una persona y guardarlo en la agenda.");
    System.out.println("Opción 2: Buscar datos de una persona por documento.");
    System.out.println("Opción 3: Listar todas las personas.");
    System.out.println("Opcion 4: Salir");
    opcion = teclado.leerEntero("Ingrese la opcion deseada.");
            
    switch(opcion)
    {
        case 1:
            System.out.println("Elegiste la opción 1.");
            break;
            
        case 2:
            break;
            
        case 3:
            break;
    }
            
    
    
        } while (opcion != 4);
    
    }
    
    public void LeerDatos()
    {
        for (int i = 0; i < arregloGente.length; i++) {
            System.out.println("Estas en la posición " + i + ".");
            
            
        }
        
        
        
    }
    
    
    
    
    
    
    
}