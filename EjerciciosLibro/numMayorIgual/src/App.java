import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    //8. Pedir dos números y decir cual es el mayor o si son iguales.
    public static void main(String[] args) throws Exception {
       
        //Scanner sc = new Scanner(System.in);

        int num1, num2;
       /*  System.out.println("Ingrese un número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que "+ num2);
        } else if (num2 > num1){
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println(num1 + " y " + num2 + " son iguales");
        } */

        // Ahora JOptionPaine

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1 + " es mayor que "+ num2);
        } else if (num2 > num1){
            JOptionPane.showMessageDialog(null, num2 + " es mayor que "+ num1);
        } else {
            JOptionPane.showMessageDialog(null, "Son iguales");
        } 
    }
}
