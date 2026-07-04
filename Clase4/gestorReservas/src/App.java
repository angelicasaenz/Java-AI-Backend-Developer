import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {

            Menu.mostrarMenu();
            opcion = Menu.leerOpcion(sc);
            sc.nextLine();
            
            switch (opcion) {
                // Agendar una reserva
                case 1:
                    Operaciones.agendar(sc);
                    break;
                case 2:
                // Listar todas las reservas del día.
                    Operaciones.listar();    
                    break;
                // Cancelar una reserva por su número.
                case 3:
                    Operaciones.cancelarReserva(sc);
                    break;
                // Ver el reporte del día: total de citas y dinero facturado.
                case 4:
                    Operaciones.reporte();
                    break;
                // Salir del programa
                case 5:
                    System.out.println("Gracias por usar el gestor de reservas. Hasta pronto!");
                    break;
                default:
                    break;
            }
        }
    }
}
