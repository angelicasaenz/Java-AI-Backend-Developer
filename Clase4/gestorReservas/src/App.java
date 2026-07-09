import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 9) {

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
                // Buscar cliente
                case 5:
                    Operaciones.buscarCiente(sc);
                    break;
                // Editar reserva
                case 6:
                    Operaciones.editarReserva(sc);
                    break;
                // Salir del programa
                case 7:
                    Operaciones.mostrarHorasDisponibles(sc);
                    break;
                // Servicio más pedido
                case 8:
                    Operaciones.srvicioMasPedido(sc);
                    break;
                // Salir del programa
                case 9:
                    System.out.println("Gracias por usar el gestor de reservas. Hasta pronto!");
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
