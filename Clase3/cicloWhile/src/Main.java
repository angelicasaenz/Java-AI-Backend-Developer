import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Simula una cuenta regresiva desde un número que pida el usuario hasta 0, imprimiendo "¡Despegue!" al final.

        Scanner sc = new Scanner(System.in);
        System.out.println("*** 🚀🚀 CUENTA REGRESIVA PARA EL DESPEGUE DE UN COHETE 🚀🚀***");
        System.out.print("Ingrese un número para iniciar la cuenta regresiva: ");
        int num = sc.nextInt();

        while (num >= 0){
            System.out.println(num);
            num--;
        }
        System.out.println("🎉 ¡¡¡DESPEGUE!!! 🚀🚀🚀");
    }
}