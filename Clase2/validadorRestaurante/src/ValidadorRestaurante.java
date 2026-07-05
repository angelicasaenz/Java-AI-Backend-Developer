import java.util.Scanner;

public class ValidadorRestaurante {


    public static void validar(){

        final double PORCENTAJE_PROPINA = 0.10;
        final double DESCUENTO_FRECUENTE = 0.05;
        final double TOPE_DESCUENTO = 100000;

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de la cuenta: ");
        double cuenta = sc.nextDouble();

        System.out.print("Numero de personas: ");
        int personas = sc.nextInt();
        sc.nextLine();

       /*  System.out.print("¿Cliente frecuente? (true/false): ");
        boolean frecuente = sc.nextBoolean(); */

       
        System.out.print("Es cliente frecuente? (si/no): ");
        String clienteFrecuente = sc.nextLine();
        boolean esFrecuente = clienteFrecuente.equalsIgnoreCase("si");

        double propina = cuenta * PORCENTAJE_PROPINA;
        double total = cuenta + propina;

        if (esFrecuente && cuenta > TOPE_DESCUENTO) {
            total = total - (total * DESCUENTO_FRECUENTE);
        }

        double porPersona = total / personas;

        System.out.println("Propina: " + propina);
        System.out.println("Total final: " + total);
        System.out.println("Cada persona paga: " + porPersona);
        System.out.println("");
        if (porPersona > 50000) {
            System.out.println("!!Cuenta alta!!");
        }

        sc.close();

    }
}
