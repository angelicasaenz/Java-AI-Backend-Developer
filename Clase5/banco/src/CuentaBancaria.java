public class CuentaBancaria {

    // atributos
    String titular;
    String numeroCuenta;
    double saldo;

    // Constructores

    //Constructor sin parametros
    public CuentaBancaria(){
        this.titular = "Sin asignar";
        this.numeroCuenta = "0000";
        this.saldo   = 0.0;
    }
    // Constructor con parametros
    public CuentaBancaria(String titular, String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        if (saldo >= 0){
            this.saldo = saldo;
        } else {
            this.saldo = 0.0;
        }
    }

    // No usar setter a lo loco pisando los valores porque si, sino crear reglas de negocio
    // Getter (para leer)

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return  this.saldo;
    }
    // Operaciones con regles

    // Depositar dinero

    public void depositar(double monto){
        if (monto <= 0){
            System.out.println("Error el monto a depositar debe ser mayor a cero");
            return;
        }
        saldo += monto;
        System.out.println("Deposito exitoso, nuevo saldo: $" + saldo);
    }

    // Retirar dinero
    public void retirar(double monto){
        if (monto <= 0){
            System.out.println("Error al retirar, el monto debe ser mayor a cero");
            return;
        }
        if (monto > saldo){
            System.out.println("Error, saldo insuficiente. Saldo $" + saldo);
            return;
        }
        saldo -= monto;
        System.out.println("Retiro exitoso, nuevo saldo: $" + saldo);
    }

    // toString() pra mostrar la informacion de la cuenta

    public String toString(){
        return "Cuenta: " + numeroCuenta + " | Titular: " + titular + " | Saldo: $" + saldo;
    }
}
