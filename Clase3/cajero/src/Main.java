import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    int opcion = 0;
    Pedido pedido = new Pedido();

    do {
        System.out.println("""
                1. Nuevo pedido.
                2. Cerrar caja.
                
                """);
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();


    switch (opcion){
        case 1:
            System.out.println("Subtotal: ");
            double subTotal = sc.nextDouble();
            double total = pedido.calcularTotal(subTotal, 0.10);
            System.out.println("El total con propina es: " + total);
            break;
        case 2:
            System.out.println("Caja cerrada.");
            break;
        default:
            System.out.println("Opción invalida.");
    }
    }  while (opcion != 2);
    }
}