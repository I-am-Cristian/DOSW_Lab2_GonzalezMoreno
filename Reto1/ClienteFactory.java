public class ClienteFactory {

    public static Cliente crearCliente(String tipo) {

        if (tipo.equalsIgnoreCase("nuevo"))
            return new ClienteNuevo();

        if (tipo.equalsIgnoreCase("frecuente"))
            return new ClienteFrecuente();

        throw new IllegalArgumentException("Tipo inválido");

    }

}
