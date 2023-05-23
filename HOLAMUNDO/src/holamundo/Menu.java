package holamundo;

import java.util.concurrent.TimeUnit;


public class Menu {
     
   protected Consola teclado;
   protected Persona arregloGente[];
   protected int cantGente = 0;
   
   public Menu()
   {
       this.teclado = new Consola();
      this.arregloGente = new Persona[10];
      cantGente = 0;
   }
   
   
    public void MostrarMenu()
    {
    int opcion;
        do {  
    
    System.out.println("Bievenido al menu de la agenda. A continuación se le mostraran las opciones correspondientes.");
    System.out.println("Opción 1: Ingresar datos de una persona y guardarlo en la agenda.");
    System.out.println("Opción 2: Buscar datos de una persona por documento.");
    System.out.println("Opción 3: Listar todas las personas.");
    System.out.println("Opcion 4: Salir.");
    opcion = teclado.leerEntero("Ingrese la opcion deseada.");
            
    switch(opcion)
    {
        case 1:
            System.out.println("Elegiste la opción 1.");
            this.IngresarDatos();
            break;
            
        case 2:
            
            break;
            
        case 3:
            break;
    }
            
    
    
        } 
        while (opcion != 4);
    
    }
    
    public void IngresarDatos()
    {
        if (cantGente < arregloGente.length) 
        {
            String nombre = teclado.leerString("Ingrese el nombre de la persona.");
            System.out.println("El nombre ingresado es: " + nombre);
            String apellido = teclado.leerString("Ingrese el apellido de la persona.");
            System.out.println("El apellido ingresado es: " + apellido);
            int documento = teclado.leerEntero("Ingrese el documento de la persona.");
            System.out.println("El documento ingresado es: " + documento);
            
            System.out.println("la persona fue creada: " + nombre + " " + apellido + " " + documento);
            this.arregloGente[cantGente] = new Persona(nombre, apellido, documento);
            cantGente++;
        }
        else
        {
            System.out.println("Los espacios de la agenda están llenos.");
        }
        
        
    }
    
    
    
    
    
    
    
}