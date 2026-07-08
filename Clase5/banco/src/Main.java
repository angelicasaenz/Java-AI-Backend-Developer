//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria("Angelica Saenz", "1002599", 10_000_000);

        c1.retirar(1000000);
        c1.depositar(20000);
        c1.retirar(14000000);
        c1.depositar(-500);
        c1.retirar(0);

        // Imprimir el saldo actual
        System.out.println("Saldo actual: $" + c1.getSaldo());
        System.out.println(c1);
    }
}