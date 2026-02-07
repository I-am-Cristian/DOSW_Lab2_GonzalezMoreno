import java.util.ArrayList;
import java.util.List;

public class HamburguesaBuilder {
    private final List<Ingrediente> ingredientes = new ArrayList<>();

    public HamburguesaBuilder agregarPan() {
        ingredientes.add(new Ingrediente("Pan", 3000));
        return this;
    }

    public HamburguesaBuilder agregarCarne() {
        ingredientes.add(new Ingrediente("Carne", 10000));
        return this;
    }

    public HamburguesaBuilder agregarQueso() {
        ingredientes.add(new Ingrediente("Queso", 5000));
        return this;
    }

    public HamburguesaBuilder agregarVegetales() {
        ingredientes.add(new Ingrediente("Vegetales", 2000));
        return this;
    }

    public HamburguesaBuilder agregarSalsa() {
        ingredientes.add(new Ingrediente("Salsa", 1000));
        return this;
    }

    public Hamburguesa build() {
        return new Hamburguesa(ingredientes);
    }
}
