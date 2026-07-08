public class Cliente {

    // atributos
    private String nombre;
    private String documento;
    private String telefono;
    private String email;
    private int edad;

    // Constructores

    // Constructor sin parametros
    public Cliente() {
        this.nombre = "Sin asignar";
        this.documento = "0000";
        this.telefono = "0000";
        this.email = "sin@email.com";
        this.edad = 0;
    }

    // Constructor con parametros
    public Cliente(String nombre, String documento, String telefono, String email, int edad) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.email = email;
        if (edad >= 0) {
            this.edad = edad;
        } else {
            this.edad = 0;
        }
    }

    // Getters (para leer)

    public String getNombre() {
        return this.nombre;
    }

    public String getDocumento() {
        return this.documento;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public int getEdad() {
        return this.edad;
    }

    // Metodos con reglas de negocio

    public void actualizarTelefono(String nuevoTelefono) {
        if (nuevoTelefono == null || nuevoTelefono.isBlank()) {
            System.out.println("Error: el telefono no puede estar vacio");
            return;
        }
        this.telefono = nuevoTelefono;
        System.out.println("Telefono actualizado correctamente");
    }

    public void actualizarEmail(String nuevoEmail) {
        if (nuevoEmail == null || !nuevoEmail.contains("@")) {
            System.out.println("Error: el email no es valido");
            return;
        }
        this.email = nuevoEmail;
        System.out.println("Email actualizado correctamente");
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // toString() para mostrar la informacion del cliente

    public String toString() {
        return "Cliente: " + nombre + " | Documento: " + documento
                + " | Telefono: " + telefono + " | Email: " + email
                + " | Edad: " + edad;
    }
}
