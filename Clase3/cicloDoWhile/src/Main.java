import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Pide un número entre 1 y 5; si está fuera de rango, vuelve a pedirlo.
//        Solo termina cuando el dato es válido.

        Scanner sc = new Scanner(System.in);
        int num;
        boolean estaEnRango = false;

        do {
            System.out.print("Ingrese un número entre 1 y 5: ");
            num = sc.nextInt();
            if (num >= 1 && num <= 5){
                estaEnRango = true;
                System.out.println("Gracias! el número esta en el rango solicitado");
            }else {
                System.out.println("Número invalido, intente nuevamente.");
            }
        }while (!estaEnRango);
    }
}