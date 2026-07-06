import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Pide 4 precios al usuario, guárdalos en un array y muestra el promedio.

        Scanner sc = new Scanner(System.in);
        int[] precios = new int[4];
        int suma = 0;

        for(int i = 0; i < precios.length; i++){
            System.out.print("Ingrese el precio: ");
            precios[i] = sc.nextInt();
            suma += precios[i];
        }
        System.out.println("El promedio de los precios ingresados es: " + (suma / precios.length));
    }
}