import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Con el array del ejercicio D, pregunta al usuario un nombre y di si está o no en el inventario (usa una bandera boolean).

        Scanner sc = new Scanner(System.in);
        String [] productos = {"Agua", "Gaseosa", "Café"};

//        for(int i = 0; i < productos.length; i++){
//            System.out.println(i+1 + ". " + productos[i]);
//        }

        boolean estaEnInventario = false;
        System.out.print("Ingrese el nombre del producto que desea buscar: ");
        String nombre = sc.nextLine();

        for (int i = 0; i < productos.length; i++){
            if (nombre.equalsIgnoreCase(productos[i])){
                estaEnInventario = true;
                break;
            }
        }

        if (estaEnInventario){
            System.out.println("Ese producto si está en el inventario");
        } else {
            System.out.println("Ese producto no está en el inventario");
        }

        sc.close();

    }
}