package b7;

import java.util.Scanner;

public class ejercicio4 {
    public class ManejoDeCadenas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese una cadena de texto
            System.out.print("Ingrese una cadena de texto: ");
            String cadena = scanner.nextLine();

            // Mostrar la longitud de la cadena
            System.out.println("Longitud de la cadena: " + cadena.length());

            // Convertir la cadena a mayúsculas
            String mayusculas = cadena.toUpperCase();
            System.out.println("Cadena en mayúsculas: " + mayusculas);

            // Convertir la cadena a minúsculas
            String minusculas = cadena.toLowerCase();
            System.out.println("Cadena en minúsculas: " + minusculas);

            // Verificar si la cadena contiene la palabra "Java"
            if (cadena.contains("Java")) {
                System.out.println("La cadena contiene la palabra 'Java'.");
            } else {
                System.out.println("La cadena no contiene la palabra 'Java'.");
            }
        }
    }
}
