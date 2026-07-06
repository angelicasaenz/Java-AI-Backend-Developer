import java.util.Scanner;

public class Operaciones {

    static String nombre = "";
    static int cantidad = 0;
    static double precio = 0.0;
    static boolean hayProducto = false;

    public static void registrar(Scanner sc){

        nombre = Validador.leerTexto(sc, "Nombre del producto: ");
        cantidad = Validador.leerEntero(sc, "Cantidad: ");
        precio = Validador.leerDouble(sc, "Precio: ");
        hayProducto = true;
        System.out.println("");
        System.out.println("Producto registrado exitosamente.");
    }

    public static void verProducto(Scanner sc){
        if (!hayProducto){
            System.out.println("Aún no hay producto registrado");
        } else {
            System.out.println("Nombre: " + nombre);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio: " + precio);
        }
    }

    public static void actualizarCantidad(Scanner sc){
        if (!hayProducto){
            System.out.println("Aún no hay producto registrado");
        } else {
            cantidad = Validador.leerEntero(sc, "Cantidad nueva: ");
            System.out.println("Se ha actualizado correctamente");
        }
    }

    public static void verValorTotal(Scanner sc){
        if (!hayProducto){
            System.out.println("Aún no hay producto registrado");
        } else {
            double valorTotal = cantidad * precio;
            System.out.println("El total es: " + valorTotal);
        }
    }
}
