package b7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio7 {
    public class SistemaBancario {
        private static Map<String, CuentaBancaria> cuentas = new HashMap<>();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                mostrarMenu();
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        crearCuenta();
                        break;
                    case 2:
                        realizarDeposito();
                        break;
                    case 3:
                        realizarRetiro();
                        break;
                    case 4:
                        consultarSaldo();
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema bancario. ¡Hasta luego!");
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            }
        }

        private static void mostrarMenu() {
            System.out.println("\n--- Menú del Sistema Bancario ---");
            System.out.println("1. Crear nueva cuenta");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
        }

        private static void crearCuenta() {
            System.out.print("Ingrese el nombre del titular de la cuenta: ");
            String titular = scanner.next();

            CuentaBancaria nuevaCuenta = new CuentaBancaria(titular);
            cuentas.put(titular, nuevaCuenta);

            System.out.println("Cuenta creada exitosamente para " + titular);
        }

        private static void realizarDeposito() {
            System.out.print("Ingrese el nombre del titular de la cuenta: ");
            String titular = scanner.next();

            if (cuentas.containsKey(titular)) {
                System.out.print("Ingrese la cantidad a depositar: ");
                double cantidad = scanner.nextDouble();

                cuentas.get(titular).depositar(cantidad);

                System.out.println("Depósito realizado exitosamente. Saldo actual: " + cuentas.get(titular).getSaldo());
            } else {
                System.out.println("La cuenta no existe. Por favor, cree una cuenta primero.");
            }
        }

        private static void realizarRetiro() {
            System.out.print("Ingrese el nombre del titular de la cuenta: ");
            String titular = scanner.next();

            if (cuentas.containsKey(titular)) {
                System.out.print("Ingrese la cantidad a retirar: ");
                double cantidad = scanner.nextDouble();

                if (cuentas.get(titular).retirar(cantidad)) {
                    System.out.println("Retiro realizado exitosamente. Saldo actual: " + cuentas.get(titular).getSaldo());
                } else {
                    System.out.println("Fondos insuficientes para realizar el retiro.");
                }
            } else {
                System.out.println("La cuenta no existe. Por favor, cree una cuenta primero.");
            }
        }

        private static void consultarSaldo() {
            System.out.print("Ingrese el nombre del titular de la cuenta: ");
            String titular = scanner.next();

            if (cuentas.containsKey(titular)) {
                System.out.println("Saldo actual de la cuenta de " + titular + ": " + cuentas.get(titular).getSaldo());
            } else {
                System.out.println("La cuenta no existe. Por favor, cree una cuenta primero.");
            }
        }
    }

    class CuentaBancaria {
        private String titular;
        private double saldo;

        public CuentaBancaria(String titular) {
            this.titular = titular;
            this.saldo = 0;
        }

        public void depositar(double cantidad) {
            saldo += cantidad;
        }

        public boolean retirar(double cantidad) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                return true;
            } else {
                return false;
            }
        }

        public double getSaldo() {
            return saldo;
        }
    }
}
