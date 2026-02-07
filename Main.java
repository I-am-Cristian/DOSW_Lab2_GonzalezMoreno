public class Main {
    public static void main(String[] args) {

        System.out.println("¡Bienvenido a la tienda Don Pepe!");

        Cliente cliente = new Cliente(TipoCliente.FRECUENTE);
        Carrito carrito = new Carrito();

        Producto camiseta = new Producto("Camiseta", 20000);
        Producto pantalon = new Producto("Pantalón", 50000);
        Producto galletas = new Producto("Galletas", 500);
        Producto jugo = new Producto("Jugo Natural", 3000);

        carrito.agregarProducto(camiseta, 2);
        carrito.agregarProducto(galletas, 3);
        carrito.agregarProducto(jugo, 5);

        double subtotal = carrito.calcularSubtotal();
        double descuento = cliente.aplicarDescuento(subtotal);
        double total = subtotal - descuento;

        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getTipo());

        System.out.println("Productos:");
        carrito.getItems().forEach(item ->
                System.out.println("- " + item.getProducto().getNombre() +
                        " - $" + item.getTotal())
        );

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + total);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}
