public class DescuentoFrecuente implements EstrategiaDescuento {
    @Override
    public double calcularDescuento(double total) {
        return total * 0.10; // 10% de descuento
    }
}
