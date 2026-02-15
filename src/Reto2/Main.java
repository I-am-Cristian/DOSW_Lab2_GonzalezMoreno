package src.Reto2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Ingrediente pan =
                new Ingrediente("Pan", 3000);

        Ingrediente carne =
                new Ingrediente("Carne", 10000);

        Ingrediente queso =
                new Ingrediente("Queso", 5000);

        Ingrediente tocino =
                new Ingrediente("Tocino", 4000);


        HamburguesaBuilder builder =
                new HamburguesaBuilder();

        Chef chef =
                new Chef(builder);


        chef.agregarIngrediente(pan);
        chef.agregarIngrediente(carne);
        chef.agregarIngrediente(queso);
        chef.agregarIngrediente(tocino);


        Hamburguesa hamburguesa =
                chef.construir();


        System.out.println("\nHAMBURGUESA PERSONALIZADA");

        List<Ingrediente> ingredientes =
                hamburguesa.getIngredientes();


        String nombres =
                ingredientes.stream()
                        .map(Ingrediente::getNombre)
                        .collect(Collectors.joining(", "));


        double precio =
                ingredientes.stream()
                        .map(Ingrediente::getPrecio)
                        .reduce(0.0, Double::sum);


        System.out.println("\nIngredientes:");

        System.out.println(nombres);

        System.out.println("\nPrecio total: $" + precio);

        System.out.println("\nDisfruta tu hamburguesa!");

    }

}
