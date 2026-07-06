import java.util.Scanner;
import java.util.SimpleTimeZone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre = leerTexto(sc, "Ingrese su nombre: ");
        int edad = leerEdad(sc, "Ingrese su edad: ");
        boolean acepta = leerRespuesta(sc, "Acepta los terminos y condiciones? ");

        System.out.println("**** REGISTRO EXITOSO ***");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Aceptó terminos: " + acepta);
    }

    public static String leerTexto(Scanner sc, String mensaje){
        while (true){
            System.out.print(mensaje);
            String info = sc.nextLine();
            if (!info.trim().isEmpty()) {
                return info;
            } else {
                System.out.println("Nombre invalido, por favor intente de nuevo");
            }
        }
    }
    public static int leerEdad(Scanner sc, String mensaje){
        while (true){
            int valor = 0;
            System.out.print(mensaje);
            if (sc.hasNextInt()){
                valor = sc.nextInt();
                sc.nextLine();
                if (valor >= 1 && valor <= 120){
                    return valor;
                } else {
                    System.out.println("La edad está fuera del rango");
                }
            } else {
                System.out.println("Edad invalida, por favor ingresela de nuevo");
                sc.nextLine();
            }
        }
    }

    public static boolean leerRespuesta(Scanner sc, String mensaje){
        while (true){

            System.out.print(mensaje);
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si")){
                return true;
            } else if (respuesta.equalsIgnoreCase("no")){
                return false;
            } else {
                System.out.println("Respuesta inváida, por favor intente de nuevo");
            }

        }
    }
}