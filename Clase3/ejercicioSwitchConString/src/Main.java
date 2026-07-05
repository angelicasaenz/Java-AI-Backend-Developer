import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Pide un día de la semana como texto e imprime "Laboral" o "Fin de semana" según corresponda,
//        usando un switch sobre String.


        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un día de la semana: ");
        String dia = sc.nextLine().toLowerCase();

        switch (dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Ingrese un dato valido");
        }
    }
}