package b7;

import java.util.Scanner;

public class ejercicio3 {
    public class ConversorDeTemperatura {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la temperatura: ");
            double temperatura = scanner.nextDouble();

            System.out.print("Ingrese la unidad (C para Celsius, F para Fahrenheit): ");
            char unidad = scanner.next().charAt(0);

            double temperaturaConvertida;

            if (unidad == 'C' || unidad == 'c') {
                // Convertir de Celsius a Fahrenheit
                temperaturaConvertida = celsiusAFahrenheit(temperatura);
                System.out.println(temperatura + " grados Celsius son " + temperaturaConvertida + " grados Fahrenheit.");
            } else if (unidad == 'F' || unidad == 'f') {
                // Convertir de Fahrenheit a Celsius
                temperaturaConvertida = fahrenheitACelsius(temperatura);
                System.out.println(temperatura + " grados Fahrenheit son " + temperaturaConvertida + " grados Celsius.");
            } else {
                System.out.println("Unidad no válida. Ingrese 'C' para Celsius o 'F' para Fahrenheit.");
            }
        }

        // Método para convertir de Celsius a Fahrenheit
        private static double celsiusAFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        // Método para convertir de Fahrenheit a Celsius
        private static double fahrenheitACelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
    }
}
