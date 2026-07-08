//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria("Angelica Saenz", "1002599", 10_000_000, "Ahorros");
        CuentaBancaria c2 = new CuentaBancaria("Catalina Saenz", "12324234", 2_000_000, "Corriente");

        c1.retirar(1000000);
        c1.depositar(20000);
        c1.retirar(14000000);
        c1.depositar(-500);
        c1.retirar(0);

        c1.transferir(c2,20000);

        // Imprimir el saldo actual
        System.out.println("\nCuenta de: " + c1.getTitular() + " | Saldo actual: $" + c1.getSaldo());
        System.out.println(c1);
        // Imprimir el saldo actual
        System.out.println("\nCuenta de: " + c2.getTitular() + " | Saldo actual: $" + c2.getSaldo());
        System.out.println(c2);

    }
}