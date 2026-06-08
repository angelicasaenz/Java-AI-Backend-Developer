import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {

    //6. Pedir dos números y decir si uno es múltiplo del otro.
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        /* System.out.println("Ingrese un número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = sc.nextInt();

        if(num1 % num2 == 0){
            System.out.println(num1 + " es multiplo de " + num2);
        } else if(num2 % num1 == 0){
            System.out.println(num2 + " es multiplo de " + num1);
        } else {
            System.out.println("Ninguno es multiplo del otro.");
        }
        sc.close();*/
        // Ahora por ventana emergente

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        if(num1 % num2 == 0){
            JOptionPane.showMessageDialog(null, num1 + " es multiplo de " + num2);
        } else if(num2 % num1 == 0){
            JOptionPane.showMessageDialog(null, num2 + " es multiplo de " + num1);
        } else {
            JOptionPane.showMessageDialog(null, "Ninguno es múltiplo del otro");
        }


    }
}
