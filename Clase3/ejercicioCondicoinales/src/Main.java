import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Pide la edad con Scanner e imprime "Menor de edad" si es menor a 18, "Adulto" entre 18 y 64,
//        "Adulto mayor" si es 65 o más.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingese su edad: ");
        int edad = sc.nextInt();

        if (edad < 18){
            System.out.println("Es  menor de edad");
        } else if(edad >= 18 && edad <= 64){
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }



    }
}