import java.util.Scanner;

public class Operaciones {

    static String nombre = "";
    static int cantidad = 0;
    static double precio = 0.0;
    static boolean hayProducto = false;

    //Validar que no hay producto

    public static boolean noHayProducto(){
        if (!hayProducto){
            System.out.println("Aún no hay producto registrado");
            return true;
        }
        return false;
    }

    public static void registrar(Scanner sc){

        nombre = Validador.leerTexto(sc, "Nombre del producto: ");
        cantidad = Validador.leerEntero(sc, "Cantidad: ");
        precio = Validador.leerDouble(sc, "Precio: ");
        hayProducto = true;
        System.out.println();
        System.out.println("Producto registrado exitosamente.");
    }

    public static void verProducto(Scanner sc){
        if (noHayProducto()){
            return;
        }else {
            System.out.println("Nombre: " + nombre);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio: " + precio);
        }
    }

    public static void actualizarCantidad(Scanner sc){
        if (noHayProducto()){
            return;
        } else {
            cantidad = Validador.leerEntero(sc, "Cantidad nueva: ");
            System.out.println("Se ha actualizado correctamente");
        }
    }

    public static void verValorTotal(Scanner sc){
        if (noHayProducto()){
            return;
        } else {
            double valorTotal = cantidad * precio;
            System.out.println("El total es: " + valorTotal);
        }
    }
}
