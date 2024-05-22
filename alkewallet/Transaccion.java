package alkewallet;

public class Transaccion {
    private double monto;
    private String tipo; // "deposito" o "retiro"

    public Transaccion(double monto, String tipo) {
        this.monto = monto;
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public String getTipo() {
        return tipo;
    }
}
