public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenido a Don Pepe");

        Cliente cliente =
                ClienteFactory.crearCliente("frecuente");

        Producto camiseta =
                new Producto("Camiseta", 20000);

        Producto galletas =
                new Producto("Galletas", 500);

        Producto jugo =
                new Producto("Jugo", 3000);

        Carrito carrito = new Carrito();

        carrito.agregarProducto(camiseta, 2);
        carrito.agregarProducto(galletas, 3);
        carrito.agregarProducto(jugo, 5);

        Recibo recibo =
                new Recibo(cliente, carrito);

        recibo.imprimir();

    }

}
