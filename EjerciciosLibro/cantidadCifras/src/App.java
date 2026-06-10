import java.util.Scanner;

public class App {

    // 11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entre 0 y 9.999");
        int num = sc.nextInt();

        if (num < 10) {
            System.out.println(num + " tiene 1 cifra");
        } else if ( num < 100){
            System.out.println(num + " tiene 2 cifras");
        } else if ( num < 1000){
            System.out.println(num + " tiene 3 cifras");
        } else if ( num < 10000){
            System.out.println(num + " tiene 4 cifras");
        }
    }
}
