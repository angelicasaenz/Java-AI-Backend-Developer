//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Crea un array con 5 números fijos y recórrelo con un for para imprimir la suma.

        int[] arreglo = {1, 5, 3, 6, 8};

        int suma = 0;

        for (int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
        }
        System.out.println(suma);
    }
}