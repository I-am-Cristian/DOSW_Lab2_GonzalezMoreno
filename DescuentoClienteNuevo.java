public class DescuentoClienteNuevo implements DescuentoStrategy {
    @Override
    public double calcularDescuento(double subtotal) {
        return subtotal * 0.05;
    }
}