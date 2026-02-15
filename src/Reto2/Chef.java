package src.Reto2;
public class Chef {

    private HamburguesaBuilder builder;

    public Chef(HamburguesaBuilder builder) {

        this.builder = builder;

    }

    public void agregarIngrediente(Ingrediente ingrediente) {

        builder.agregarIngrediente(ingrediente);

    }

    public Hamburguesa construir() {

        return builder.build();

    }

}
