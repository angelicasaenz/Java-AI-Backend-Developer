import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {

    // 5. Pedir un número e indicar si es positivo o negativo.3
    public static void main(String[] args) throws Exception {
        
        
        /* Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("El número es positivo");
        } else if (num < 0) {
            System.out.println("EL número es negativo");
            
        }else{
            System.out.println("El número es cero. ");  
        }
        sc.close(); */

        //Ahora con JOption
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "El número es positivo");
        } else if (num < 0) {
            JOptionPane.showMessageDialog(null, "El número es negativo");
            
        }else{
            JOptionPane.showMessageDialog(null, "El número es cero");
        }

    }
}
