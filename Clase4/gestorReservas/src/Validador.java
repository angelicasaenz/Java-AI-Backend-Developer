public class Validador {


    public static boolean horaValida(int hora){

        if (hora >= 8 && hora <= 17) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean nombreValido(String nombre){
        if (nombre == null) {
            return false;
        } else if (nombre.trim().isEmpty()){
            return false;
        } else {
            return true;
        }
    }

    public static boolean servicioValido(int servicio){
        if (servicio >= 1 && servicio <= 3) {
            return true;
        } else {
            return false;
        }
    }


    
}
