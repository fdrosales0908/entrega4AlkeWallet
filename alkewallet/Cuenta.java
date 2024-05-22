

package alkewallet;

public class Cuenta {
    private double saldo;

    public Cuenta() {
        this.saldo = 0.0;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) throws Exception {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            throw new Exception("Saldo insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

