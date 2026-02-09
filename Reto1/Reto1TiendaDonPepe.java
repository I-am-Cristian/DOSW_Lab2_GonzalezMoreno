public class Reto1TiendaDonPepe {
    public static void ejecutar() {
        System.out.println("--- Bienvenido a la tienda Don Pepe! ---");

        Producto camiseta = new Producto("Camiseta", 20000);
        Producto galletas = new Producto("Galletas", 500);
        Producto jugo = new Producto("Jugo Natural", 3000);

        Carrito carrito = new Carrito();

        // Simular compra del escenario ejemplo [cite: 77-80]
        carrito.agregarProducto(camiseta, 2);
        carrito.agregarProducto(galletas, 3);
        carrito.agregarProducto(jugo, 5);

        // Calcular valores
        double subtotal = carrito.calcularSubtotal();
        EstrategiaDescuento descuento = new DescuentoFrecuente(); // Cliente Frecuente [cite: 89]
        double valorDescuento = descuento.calcularDescuento(subtotal);
        double total = subtotal - valorDescuento;

        // Imprimir Recibo [cite: 85-95]
        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: Frecuente");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $" + valorDescuento);
        System.out.println("Total a pagar: $" + total);
        System.out.println("¡Gracias por su compra!");
    }
}