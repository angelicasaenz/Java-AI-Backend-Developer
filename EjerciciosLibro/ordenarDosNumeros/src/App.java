import java.util.Scanner;

public class App {
    // 9. Pedir dos números y mostrarlos ordenados de mayor a menor.
    public static void main(String[] args) throws Exception {
    

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        System.out.println("Ingrese un número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " " + num2);
        } else if (num2 > num1){
            System.out.println(num2 + " " + num1);
        }
        sc.close();
    }
}
