package holamundo;

import java.util.concurrent.TimeUnit;

public class Menu {

    protected Consola teclado;
    protected Persona arregloGente[];
    protected int cantGente = 0;

    public Menu() {
        this.teclado = new Consola();
        this.arregloGente = new Persona[10];
        cantGente = 0;
    }

    public void MostrarMenu() {
        int opcion;
        do {

            System.out.println("Bievenido al menu de la agenda. A continuación se le mostraran las opciones correspondientes.");
            System.out.println("Opción 1: Ingresar datos de una persona y guardarlo en la agenda.");
            System.out.println("Opción 2: Buscar datos de una persona por documento.");
            System.out.println("Opción 3: Listar todas las personas.");
            System.out.println("Opcion 4: Salir.");
            opcion = teclado.leerEntero("Ingrese la opcion deseada.");

            switch (opcion) {
                case 1:
                    System.out.println("Elegiste la opción 1.");
                    this.IngresarDatos();
                    break;

                case 2:
                    System.out.println("Ingresaste la opción 2.");
                    this.BuscarPersona();
                    break;

                case 3:
                    System.out.println("Ingresaste la opción 3.");
                    this.ListarPersonas();
                    break;
            }
        } while (opcion != 4);

    }

    public void IngresarDatos() {
        if (cantGente < arregloGente.length) {
            String nombre = teclado.leerString("Ingrese el nombre de la persona.");
            System.out.println("El nombre ingresado es: " + nombre);
            String apellido = teclado.leerString("Ingrese el apellido de la persona.");
            System.out.println("El apellido ingresado es: " + apellido);
            int documento = teclado.leerEntero("Ingrese el documento de la persona.");
            System.out.println("El documento ingresado es: " + documento);

            System.out.println("La persona fue creada: " + nombre + " " + apellido + " y " + documento + ".");
            this.arregloGente[cantGente] = new Persona(nombre, apellido, documento);
            cantGente++;
        } else {
            System.out.println("Los espacios de la agenda están llenos.");
        }
    }

    public void BuscarPersona() {
        /*
        La variable booleana documentoEncontrado no es vital para el funcionamiento del algoritmo.
        La estoy usando para probar las flags. 
         */
        Boolean documentoEncontrado = false;
        String nombreBusqueda, apellidoBusqueda;
        int documentoN = teclado.leerEntero("Ingrese el número de documento a buscar.");
        for (int i = 0; i < cantGente; i++) {
            if (documentoN == arregloGente[i].documento) {
                documentoEncontrado = true;
                System.out.println("El documento se encuentra en la agenda.");
                nombreBusqueda = arregloGente[i].nombre;
                apellidoBusqueda = arregloGente[i].apellido;
                System.out.println("A continuación se le mostrara el nombre de la persona con el documento: " + documentoN + ".");
                System.out.println("Nombre: " + nombreBusqueda + ". Apellido: " + apellidoBusqueda + ".");
            }
            if (documentoEncontrado == false) {
                System.out.println("No hay ningún contacto agendado con el número de documento: " + documentoN + ".");
            }
        }
    }

    public void ListarPersonas() {
        String nombreBusqueda, apellidoBusqueda;
        int documentoBusqueda;
        for (int i = 0; i < cantGente; i++) {
            nombreBusqueda = arregloGente[i].nombre;
            apellidoBusqueda = arregloGente[i].apellido;
            documentoBusqueda = arregloGente[i].documento;

            System.out.println("En la posición " + i + " de la agenda. "
                    + "Tienes agendado como nombre: " + nombreBusqueda + "."
                            + " Apellido: " + apellidoBusqueda + "."
                                    + " Documento: " + documentoBusqueda + ".");

        }
    }

}
