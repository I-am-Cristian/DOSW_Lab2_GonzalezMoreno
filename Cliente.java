public class Cliente {
    private final TipoCliente tipo;
    private final DescuentoStrategy descuentoStrategy;

    public Cliente(TipoCliente tipo) {
        this.tipo = tipo;
        this.descuentoStrategy = tipo == TipoCliente.FRECUENTE
                ? new DescuentoClienteFrecuente()
                : new DescuentoClienteNuevo();
    }

    public double aplicarDescuento(double subtotal) {
        return descuentoStrategy.calcularDescuento(subtotal);
    }

    public TipoCliente getTipo() {
        return tipo;
    }
}
