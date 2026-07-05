import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Pide un precio con decimales (nextDouble()) y muéstralo redondeado hacia abajo convirtiéndolo a int.
//        Explica qué pasó con los decimales.

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un precio (con decimales): ");
        double precio = sc.nextDouble();

        // Redondeo
        int precioRedondeado = (int) precio;
        System.out.println("El precio sin decimales es: " + precioRedondeado);

        System.out.printf("""
                Esto ocurre al hacer una conversión explicita (narrowing). Al convertir un número mas exacto como un double a un int, se pierden datos por lo que se eliminan los decimales. Por eso debemos confirmar con un (int)
                """);
    }
}