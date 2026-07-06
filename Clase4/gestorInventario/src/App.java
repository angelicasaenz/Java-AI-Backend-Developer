import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        while ( opcion != 5){
            Menu.mostrar();
            opcion = Menu.leerOpcion(sc);

            switch (opcion){
                case 1:
                    Operaciones.registrar(sc);
                    break;
                case 2:
                    Operaciones.verProducto(sc);
                    break;
                case 3:
                    Operaciones.actualizarCantidad(sc);
                    break;
                case 4:
                    Operaciones.verValorTotal(sc);
                    break;
                case 5:
                    System.out.printf("Gracias por usar el sistema, hata pronto!!");
                    break;
                default:
                    System.out.println("Opción invalida por favor elije entre 1 y 5");
            }

        }

        sc.close();
    }
}
