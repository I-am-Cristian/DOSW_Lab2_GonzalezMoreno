public class ClienteNuevo extends Cliente {

    public ClienteNuevo() {
        super("Nuevo");
    }

    @Override
    public double getDescuento() {
        return 0.05;
    }

}
