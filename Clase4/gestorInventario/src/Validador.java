import java.util.Scanner;

public class Validador {

    // Validamos que lo que ingrese el usuario si sea un entero.

    public static  int leerEntero(Scanner sc, String mensaje){
        while (true){
            System.out.println(mensaje);
            if (sc.hasNextInt()){
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } else {
                System.out.println("Eso no es un número entero, por favor intente de nuevo.");
                sc.nextLine();
            }
        }
    }

    // Validar double

    public static  double leerDouble(Scanner sc, String mensaje){
        while (true){
            System.out.println(mensaje);
            if (sc.hasNextDouble()){
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } else {
                System.out.println("Eso no es un número valido, por favor intente de nuevo.");
                sc.nextLine();
            }
        }
    }
    // Validar String

    public static String leerTexto (Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }

}
