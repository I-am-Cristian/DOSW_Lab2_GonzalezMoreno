public class DescuentoNuevo implements EstrategiaDescuento {
    @Override
    public double calcularDescuento(double total) {
        return total * 0.05; // 5% de descuento
    }
}
