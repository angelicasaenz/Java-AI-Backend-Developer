import java.util.Scanner;

public class Menu {

    public static void mostrarMenu(){
        System.out.println("""
                *****  GESTOR DE RESERVAS MARTA PELUQERÍA *****

                1. Agendar una reserva.
                2. Listar todas las reservas del día.
                3. Cancelar una reserva por su número.
                4. Ver el reporte del día: total de citas y dinero facturado.
                5. Buscar cliente.
                6. Editar reserva
                7. Mostrar horas disponibles. 
                8. Mostrar servico más solicitado.
                9. Salir del programa.
                """);
    }


    public static int leerOpcion(Scanner sc) {
        System.out.print( "Ingrese una opción: ");
        return sc.nextInt();
    }
}
