import java.util.Scanner;

public class Operaciones {

    static String[] clientes = new String[10];
    static int[] horas = new int[10];
    static int[] codigos = new int[10];

    static final int cupoMax = 6;
    static int contadorReservas = 0;

    // ---- Agendar una reserva ----


    public static void agendar(Scanner sc){

        // Validar si hay cupo
        if (contadorReservas < cupoMax) {

            // Nombre
            System.out.print("Ingrese su nombre: ");
            String nombre = sc.nextLine();
            if (!Validador.nombreValido(nombre)) {
                System.out.println("Nombre invalido");
                return;
            }
            // Hora
            System.out.print("Ingrese una hora: ");
            int hora = sc.nextInt();
            if (!Validador.horaValida(hora)) {
                System.out.println("Esa no es una hora valida.");
                sc.nextLine();
                return;
            }
            if (horaOcupada(hora)) {
                System.out.println("Ya hay una reserva a esa hora.");
                return;
            }
            // Servicio 

            System.out.println("""
                Servicios disponibles:
                    1. Corte de cabello $25.000
                    2. Tinte $60.000
                    3. Manicure $30.000
                
                Seleccione el que desea: 
                    """);

            int servicio = sc.nextInt();
            if (!Validador.servicioValido(servicio)) {
                System.out.println("Servicio invalido");
                sc.nextLine();
                return; 
            }

            // Guardar datos

            guardarDatos(nombre, hora, servicio);
            System.out.println("Reserva creada con exito!");

            } else {
                System.out.println( "No hay cupos disponibles :( ");
            }
    }

     // Hora
    public static boolean horaOcupada(int horaBuscar){
        for(int i = 0; i < contadorReservas; i++){
            if (horaBuscar == horas[i]) {
                return true;
            } 
        }
        return false;
    }

    // Guardar datos en el arreglo

    public static void guardarDatos(String nombre, int hora, int servicio){

            clientes[contadorReservas] = nombre;
            horas[contadorReservas] = hora;
            codigos[contadorReservas] = servicio;
            contadorReservas++;
        }

     
        
    //  ---- Listar las reservas ----
    
    public static void listar(){
        
        if(contadorReservas == 0){
            System.out.println("Aún no hay reservas");
            return;
        }
        System.out.println("");
        System.out.println("Listado de reservas: ");
        System.out.println("");
        for(int i = 0; i < contadorReservas; i++){
            System.out.println(i+1 + ". Cliente: " + clientes [i] + " | Hora: "+ horas[i] + " | Servicio: " + mostrarServicio(codigos[i]));
        }
        
    }


    
    // Mostrar servicio
    public static String mostrarServicio(int servicio){
        switch (servicio) {
            case 1:
                return "Corte";
            case 2:
                return "Tinte";
            case 3:
                return "Manicure";
            default:
                return "Servicio no encontrado.";
        } 
    }

    //  ---- Cancelar reserva ----
    
    public static void cancelarReserva(Scanner sc){
        System.out.print("Ingrese el número de reserva a cancelar: ");
        int posicionBorrar = sc.nextInt();
        int indice = posicionBorrar -1;
        sc.nextLine();

        if (indice < 0 || indice >= contadorReservas){             
            System.out.println("Número de reserva invalido.");
            return;
        }else{
            for(int i = indice; i < contadorReservas-1; i++){
                clientes[i] = clientes[i +1 ];
                horas[i] = horas [i + 1];
                codigos[i] = codigos[i + 1];
            }
            contadorReservas--;
            System.out.println("Se ha cancelado con exito la reserva");
            System.out.println("");
        }
                      
    }
    
        //  ---- Ver reporte ----


    public static void reporte(){
    
        int dineroFacturado = 0;
        for(int i = 0; i < contadorReservas; i++){
            
            dineroFacturado += mostrarPrecio(codigos[i]);
        }
        System.out.println("Reporte de día: ");
        System.out.println("");
        System.out.println("Total de las citas: " + contadorReservas);
        System.out.println("Dinero facturado: " + dineroFacturado);
    }

        // Mostrar precio
        public static int mostrarPrecio(int precio){
        switch (precio) {
            case 1:
                return 25000;
            case 2:
                return 60000;
            case 3:
                return 30000;
            default:
                return 0;
        } 
    }

}




    