public class Pedido {

    public static double calcularTotal(double subTotal, double porcentajePropinas){
        double propina = subTotal * porcentajePropinas;
        return propina + subTotal;
    }
}
