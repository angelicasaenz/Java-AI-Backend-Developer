public class Cliente {

    private String nombre;
    private int hora;
    private int codigoServicio;

    public Cliente(String nombre, int hora, int codigoServicio) {
        this.nombre = nombre;
        this.hora = hora;
        this.codigoServicio = codigoServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHora() {
        return hora;
    }

    public int getCodigoServicio() {
        return codigoServicio;
    }
}
