import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Pide si el usuario tiene licencia (true/false) y su edad. Imprime "Puede conducir"
//        solo si tiene licencia Y es mayor de 18.

        // Preguntar si tiene licencia
        Scanner sc = new Scanner(System.in);
        System.out.print("Tiene licencia de conducir? (si/no): ");
        String respuesta = sc.nextLine();
        boolean tieneLicencia = respuesta.equalsIgnoreCase("si");

        // Preguntar su edad
        System.out.print("Ingrese su edad: ");
        short edad = sc.nextShort();

        // Validar condicion
        if (tieneLicencia && edad >= 18){
            System.out.println("Puede conducir");
        } else {
            System.out.println("No puede conducir");
        }

        sc.close();

    }
}