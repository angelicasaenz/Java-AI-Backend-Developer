import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Pide al usuario su edad. Si escribe algo que no es número, vuelve a preguntar. Reutiliza la idea de leerEntero.

        Scanner sc = new Scanner(System.in);

        int edad = leerEntero(sc, "Ingrese su edad: ");
        System.out.println("Edad ingresada correctamente: " + edad);




    }

    public static int leerEntero(Scanner sc, String mensaje){
        int edad = 0;
        while (true){
            System.out.print(mensaje);
            if (sc.hasNextInt()){
                edad = sc.nextInt();
                sc.nextLine();
                return edad;
            }else {
                System.out.println("Eso no es un entero");
                sc.nextLine();
            }
        }

    }
}