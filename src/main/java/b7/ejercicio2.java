package b7;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    public class ListaDeCompras {
        public static void main(String[] args) {
            ArrayList<String> listaDeCompras = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n--- Lista de Compras ---");
                System.out.println("1. Agregar elemento");
                System.out.println("2. Mostrar lista");
                System.out.println("3. Eliminar elemento");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el elemento a agregar: ");
                        String elemento = scanner.next();
                        listaDeCompras.add(elemento);
                        System.out.println("Elemento agregado a la lista.");
                        break;
                    case 2:
                        if (listaDeCompras.isEmpty()) {
                            System.out.println("La lista de compras está vacía.");
                        } else {
                            System.out.println("Lista de compras:");
                            for (String item : listaDeCompras) {
                                System.out.println("- " + item);
                            }
                        }
                        break;
                    case 3:
                        if (listaDeCompras.isEmpty()) {
                            System.out.println("La lista de compras está vacía. No hay elementos para eliminar.");
                        } else {
                            System.out.print("Ingrese el elemento a eliminar: ");
                            String elementoAEliminar = scanner.next();
                            if (listaDeCompras.remove(elementoAEliminar)) {
                                System.out.println("Elemento eliminado de la lista.");
                            } else {
                                System.out.println("El elemento no existe en la lista.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            }
        }
    }
}



