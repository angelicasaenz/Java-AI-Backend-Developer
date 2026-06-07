import java.util.Scanner;

public class App {

    // 2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de un circulo: ");
        double radio = sc.nextDouble();
        double area = (Math.PI * Math.pow(radio, 2));
        System.out.println("El área del circulo es: " + area);
        sc.close();
    }
}
