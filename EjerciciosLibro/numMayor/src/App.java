import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {

    // 7. Pedir dos números y decir cual es el mayor.
    public static void main(String[] args) throws Exception {

        /* Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el otro número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + ", es mayor que " + num2);
        } else {
            System.out.println(num2 + ", es mayor que " + num1);
        }
 */       // Ahora dcon JOptionPaine

        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1 + ", es mayor que " + num2);
        } else {
            JOptionPane.showMessageDialog(null, num2 + ", es mayor que " + num1);
        }
    }
}
