import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = leerDouble(sc, "Ingrese su salario: ");
        System.out.println("Salario registrado: "+ salario);

    }

    public static double leerDouble(Scanner sc, String mensaje){
        double valor = 0;
        while(true){
            System.out.print(mensaje);
            if (sc.hasNextDouble()){
                valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } else {
                System.out.println("Ese no es un valor valido, intenta de nuevo.");
                sc.nextLine();
            }
        }
    }
}