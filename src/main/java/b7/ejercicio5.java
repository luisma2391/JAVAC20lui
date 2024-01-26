package b7;

import java.util.Arrays;

public class ejercicio5 {
    public class Estudiante {
        private String nombre;
        private int edad;
        private double[] calificaciones;

        // Constructor
        public Estudiante(String nombre, int edad, double[] calificaciones) {
            this.nombre = nombre;
            this.edad = edad;
            this.calificaciones = calificaciones;
        }

        // Método para calcular el promedio de calificaciones
        public double calcularPromedio() {
            if (calificaciones.length == 0) {
                return 0;  // Si no hay calificaciones, el promedio es 0.
            }

            double suma = 0;
            for (double calificacion : calificaciones) {
                suma += calificacion;
            }

            return suma / calificaciones.length;
        }

        // Método para mostrar la información del estudiante
        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Calificaciones: " + Arrays.toString(calificaciones));
            System.out.println("Promedio de calificaciones: " + calcularPromedio());
        }

        public static void main(String[] args) {
            // Ejemplo de uso
            String nombre = "Juan";
            int edad = 20;
            double[] calificaciones = { 90.5, 85.0, 92.3, 88.8 };

            Estudiante estudiante = new Estudiante(nombre, edad, calificaciones);

            // Mostrar información del estudiante
            estudiante.mostrarInformacion();
        }
    }
}
