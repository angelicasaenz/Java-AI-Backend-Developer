import java.util.Scanner;

public class App {
    
        //13. Pedir un número entre 0 y 9.999, decir si es capicúa.
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int u, d, c, um, original, invertido, num;
        System.out.println("Ingrese un número entre 0 y 9.999: ");
        num = sc.nextInt();
        original = num;
        
        // unidades
        u = num % 10;
        num = num / 10;
       
        // decenas
        d = num % 10;
        num = num / 10;

        // centenas
        c = num % 10;
        num = num / 10;

        // unidades de millar
        um = num % 10;
        num = num / 10;

        // Numero invertido
        invertido = u * 1000 + d * 100 + c * 10 + um;
        if (original == invertido) {
            System.out.println("Es capicúa");
        } else {
            System.out.println( "No es capicúa");
        }

        
    }
}
