public class App {
    public static void main(String[] args) throws Exception {
        
    
        int[] arreglo = new int[100];
        
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random() * 100);
            System.out.println(arreglo[i]);
        }

        //Mostrar número mayor
        int mayor = arreglo[0];
        
        for(int i = 1; i < arreglo.length; i++){
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);

        //Mostrar número menor
        int menor = arreglo[0];
        
        for(int i = 1; i < arreglo.length; i++){
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        System.out.println("El numero menor es: " + menor);

        
        //Mostrar números primos
      
        for(int i = 0; i < arreglo.length; i++){
            int numPrueba = arreglo[i];
            boolean esPrimo = true;
            for(int j = 2; j < numPrueba; j++){
                if (numPrueba % j == 0) {
                    esPrimo = false;
                   
                } 
            }
            if (esPrimo) {
                    System.out.println("Primo: " + numPrueba); 
                }
        }



        // Mostrar en consola todos los números pares.

        for( int i = 0; i < arreglo.length; i++){
            int numPrueba = arreglo[i];
            
            if (numPrueba % 2 == 0) {
                System.out.println("Par: " + numPrueba);
            }

        }
        
        // Mostrar en consola el arreglo de forma ascendente.

        for(int i = 0; i < arreglo.length; i++){
            for(int j = i + 1; j < arreglo.length; j++){
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo [j] = aux;
                }
            }
  
        }

        // Mostrar arreglo ordenado

        System.out.println("Arreglo ordenado:");
        for(int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
}

        // Mostrar en consola el promedio del arreglo.

        int promedio = 0;
        int suma = 0;
        for(int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
        }
        promedio = suma / arreglo.length;
        System.out.println("El promedio es: " + promedio);

        // Mostrar en consola la suma del primer y último elemento del arreglo.
        int primero = arreglo[0];
        int ultimo = arreglo[arreglo.length -1];
        int sumaPU = primero + ultimo;      
        System.out.println("Primero: " + primero);
        System.out.println("Último: " + ultimo);
        System.out.println("La sumea del primero y el último es: " +sumaPU);
    
        // Mostrar en consola el mensaje "Existe cien" en dado caso el arreglo almacene por los menos un cien.
        boolean existeCien = false;
        for(int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == 100) {
                existeCien = true;
                break;
        }
        }
        if (existeCien) {
            System.out.println("Existe 100");
        } else {
            System.out.println("No existe 100");
        }
    }
}
