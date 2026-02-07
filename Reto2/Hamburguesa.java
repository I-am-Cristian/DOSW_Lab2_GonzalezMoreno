import java.util.List;

public class Hamburguesa {
    private final List<Ingrediente> ingredientes;

    public Hamburguesa(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public double calcularTotal() {
        return ingredientes.stream()
                .map(Ingrediente::getPrecio)
                .reduce(0.0, Double::sum);
    }
}
