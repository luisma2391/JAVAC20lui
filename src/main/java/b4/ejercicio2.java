package b4;

public class ejercicio2 {
    public class Ejercicio2 {

        public static void main(String[] args) {
            double[] ordename=new double[5];

            double contador=0;
            Scanner scanner = new Scanner(System.in);

            for (int i =0;i<ordename.length;i++){
                System.out.print("Ingrese su Nota");
                ordename[i]=scanner.nextDouble();
            }

            for (int i =0;i<ordename.length-1;i++){
                contador= contador+ordename[i];
            }

            System.out.println(contador/ordename.length);
        }
    }
}
