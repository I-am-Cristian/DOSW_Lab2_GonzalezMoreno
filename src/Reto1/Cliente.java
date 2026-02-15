public abstract class Cliente {

    private String tipo;

    public Cliente(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double getDescuento();

}
