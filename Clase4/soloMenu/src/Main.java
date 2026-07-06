import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Una app que muestre un menú de 3 opciones y repita hasta elegir "Salir". Sin operaciones, solo el ciclo y el switch.

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("""
                    *** MENÚ BÁSICO ***
                    1. Ingresar nombre.
                    2. Ingresar cédula.
                    3. Salir
                    
                    """);
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1 -> System.out.println("Gracias por ingresar su nombre");
                case 2 -> System.out.println("Gracias por ingresar su cédula");
                case 3 -> System.out.println("Saliendo del sistema");
                default -> System.out.println("Opción invalida");
            }

        } while (opcion != 3);

    }
}