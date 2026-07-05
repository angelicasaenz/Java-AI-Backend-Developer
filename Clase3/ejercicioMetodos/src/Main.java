import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Crea un metodo esPar(int numero) que devuelva true si el número es par y false si no.
//        Pruébalo con tres números desde el main.

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        System.out.println(esPar(num));

        System.out.print("Ingrese un número: ");
        int num2 = sc.nextInt();
        System.out.println(esPar(num2));

        System.out.print("Ingrese un número: ");
        int num3 = sc.nextInt();
        System.out.println(esPar(num3));


    }

    public static boolean esPar(int numero){
        return numero % 2 == 0;

    }
}