package b7;

import java.util.Random;
import java.util.Scanner;

public class ejercicio6 {
    public class JuegoAdivinanza {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int numeroAdivinanza = random.nextInt(100) + 1;  // Generar un número aleatorio entre 1 y 100

            System.out.println("Bienvenido al Juego de Adivinanza!");
            System.out.println("Intenta adivinar el número secreto entre 1 y 100.");

            int intentos = 0;
            int suposicion;

            do {
                System.out.print("Ingresa tu suposición: ");
                suposicion = scanner.nextInt();
                intentos++;

                if (suposicion > numeroAdivinanza) {
                    System.out.println("El número secreto es menor. Intenta de nuevo.");
                } else if (suposicion < numeroAdivinanza) {
                    System.out.println("El número secreto es mayor. Intenta de nuevo.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número secreto " + numeroAdivinanza +
                            " en " + intentos + " intentos.");
                }

            } while (suposicion != numeroAdivinanza);

            scanner.close();
        }
    }

}
