import java.util.Scanner;

public class Menu {

    public static void mostrar(){

        System.out.println("""
                **** GESTOR DE INVENTARIO COMIDA PARA GATOS ****
                1. Registrar producto.
                2. Ver producto.
                3. Actualizar cantidad.
                4. Ver valor total.
                5. Salir.
                
                """);
    }

    public static int leerOpcion(Scanner sc){

        return Validador.leerEntero(sc, "Ingrese una opción: ");
    }


}
