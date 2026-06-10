import java.util.Scanner;

public class App {

    // 12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entre 0 y 9.999: ");
        int num = sc.nextInt();
        int u, d, c, um;

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

        System.out.println(u + " " + d + " " + c + " " + um);
    }
}
