package b5;

public class ejemplo2 {
        public static void main(String[] args) {
            BufferedReader br = null;
            try {
                // Intentamos abrir un archivo que no existe
                br = new BufferedReader(new FileReader("archivo_no_existente.txt"));
                String linea;

                // Leemos el contenido del archivo línea por línea
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                // Capturamos la excepción en caso de error de lectura del archivo
                System.err.println("Error de lectura: " + e.getMessage());
            } finally {
                try {
                    // Cerramos el BufferedReader en el bloque finally para asegurar que se cierre
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException e) {
                    // Capturamos cualquier excepción que pueda ocurrir al cerrar el archivo
                    System.err.println("Error al cerrar el archivo: " + e.getMessage());
                } finally {
                    // Este bloque se ejecutará siempre, independientemente de las excepciones anteriores
                    System.out.println("Este bloque se ejecutará siempre.");
                }
            }
        }
    }
}
