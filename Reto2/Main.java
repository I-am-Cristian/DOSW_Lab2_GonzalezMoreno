public class Main {
    public static void main(String[] args) {

        System.out.println("Seleccione ingredientes de hamburguesa:");
        System.out.println("pan (3.000)");
        System.out.println("carne (10.000)");
        System.out.println("queso (5.000)\n");

        Hamburguesa hamburguesa = new HamburguesaBuilder()
                .agregarPan()
                .agregarCarne()
                .agregarQueso()
                .build();

        System.out.println("Hamburguesa personalizada");
        System.out.print("Ingredientes personalizados: ");

        hamburguesa.getIngredientes().stream()
                .map(Ingrediente::getNombre)
                .forEach(i -> System.out.print(i + ", "));

        System.out.println("\nTotal: $" + hamburguesa.calcularTotal());
        System.out.println("\nDisfrute la hamburguesa 🍔");
    }
}
