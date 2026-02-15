import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<ItemCarrito> items = new ArrayList<>();

    public void agregarProducto(Producto producto, int cantidad) {

        items.add(new ItemCarrito(producto, cantidad));

        System.out.println(
                producto.getNombre()
                        + " x"
                        + cantidad
                        + " agregado al carrito."
        );

    }

    public double calcularSubtotal() {

        return items
                .stream()
                .map(ItemCarrito::getTotal)
                .reduce(0.0, Double::sum);

    }

    public void mostrarProductos() {

        items.forEach(item ->

                System.out.println(
                        item.getProducto().getNombre()
                                + " $" + item.getTotal()
                )

        );

    }

}
