package alkewallet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario("Juan", new Cuenta());

        while (true) {
            System.out.println("1. Ver Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Convertir Moneda");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo disponible: " + usuario.getCuenta().getSaldo());
                    break;
                case 2:
                    System.out.println("Monto a depositar:");
                    double montoDeposito = scanner.nextDouble();
                    usuario.getCuenta().depositar(montoDeposito);
                    System.out.println("Depósito realizado. Saldo disponible: " + usuario.getCuenta().getSaldo());
                    break;
                case 3:
                    System.out.println("Monto a retirar:");
                    double montoRetiro = scanner.nextDouble();
                    try {
                        usuario.getCuenta().retirar(montoRetiro);
                        System.out.println("Retiro realizado. Saldo disponible: " + usuario.getCuenta().getSaldo());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Monto a convertir:");
                    double montoConversion = scanner.nextDouble();
                    System.out.println("Moneda origen (por ejemplo, USD):");
                    String monedaOrigen = scanner.next();
                    System.out.println("Moneda destino (por ejemplo, EUR):");
                    String monedaDestino = scanner.next();
                    double montoConvertido = Conversion.convertir(montoConversion, monedaOrigen, monedaDestino);
                    System.out.println("Monto convertido: " + montoConvertido + " " + monedaDestino);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
