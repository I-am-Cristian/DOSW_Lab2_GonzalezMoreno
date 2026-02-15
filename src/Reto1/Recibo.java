public class Recibo {

    private Cliente cliente;
    private Carrito carrito;

    public Recibo(Cliente cliente, Carrito carrito) {

        this.cliente = cliente;
        this.carrito = carrito;

    }

    public void imprimir() {

        System.out.println("\n--- RECIBO ---");

        System.out.println("Cliente: " + cliente.getTipo());

        carrito.mostrarProductos();

        double subtotal = carrito.calcularSubtotal();

        double descuento = subtotal * cliente.getDescuento();

        double total = subtotal - descuento;

        System.out.println("Subtotal: " + subtotal);

        System.out.println("Descuento: " + descuento);

        System.out.println("Total: " + total);

    }

}
