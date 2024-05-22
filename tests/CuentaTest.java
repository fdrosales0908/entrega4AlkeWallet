package tests;

public class CuentaTest {

}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaTest {
    @Test
    public void testDepositar() {
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(100.0);
        assertEquals(100.0, cuenta.getSaldo());
    }

    @Test
    public void testRetirar() {
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(100.0);
        try {
            cuenta.retirar(50.0);
        } catch (Exception e) {
            fail("Retiro falló");
        }
        assertEquals(50.0, cuenta.getSaldo());
    }

    @Test
    public void testRetiroSaldoInsuficiente() {
        Cuenta cuenta = new Cuenta();
        Exception exception = assertThrows(Exception.class, () -> {
            cuenta.retirar(50.0);
        });
        assertEquals("Saldo insuficiente", exception.getMessage());
    }
}
