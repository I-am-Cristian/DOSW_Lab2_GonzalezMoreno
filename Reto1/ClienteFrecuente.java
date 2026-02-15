public class ClienteFrecuente extends Cliente {

    public ClienteFrecuente() {
        super("Frecuente");
    }

    @Override
    public double getDescuento() {
        return 0.10;
    }

}
