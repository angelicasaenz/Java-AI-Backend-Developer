import java.util.Scanner;

public class App {
    // 4. Pedir dos números y decir si son iguales o no.
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números son diferentes");
        }
        sc.close();
    }
}
