import java.util.*;

public class Carrito {
    // Clase interna para manejar cantidades
    private static class Item {
        Producto producto;
        int cantidad;
        Item(Producto p, int c) { this.producto = p; this.cantidad = c; }
    }

    private final List<Item> items = new ArrayList<>();

    public void agregarProducto(Producto p, int cantidad) {
        items.add(new Item(p, cantidad));
        System.out.println(p.getNombre() + " " + cantidad + " unidades agregado al carrito."); 
    }

    public double calcularSubtotal() {
        // Uso de Streams para calcular el total 
        return items.stream()
                    .mapToDouble(i -> i.producto.getPrecio() * i.cantidad)
                    .sum();
    }

    public List<Item> getItems() { return items; }
}