//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Un array de 3 nombres de productos. Recórrelo y muestra cada uno numerado (1, 2, 3).

        String [] productos = {"Agua", "Gaseosa", "Café"};

        for(int i = 0; i < productos.length; i++){
            System.out.println(i+1 + ". " + productos[i]);
        }
    }
}